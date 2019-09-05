package com.codex.jacksonautowiring.deserializers;

import com.codex.jacksonautowiring.Auto;
import com.codex.jacksonautowiring.Car;
import com.codex.jacksonautowiring.Vehicle;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class VehicleDeserializer extends JsonDeserializer<Vehicle> {

    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public Vehicle deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        Vehicle vehicle=null;
        if (jsonNode.findPath("carDriverName")!=null){
            vehicle = objectMapper.readValue(jsonParser, Car.class);
        }else if (jsonNode.findPath("autoDriverName")!=null){
            vehicle = objectMapper.readValue(jsonParser, Auto.class);
        }
        return vehicle;
    }
}
