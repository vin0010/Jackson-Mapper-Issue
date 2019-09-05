package com.codex.jacksonautowiring.deserializers;

import com.codex.jacksonautowiring.Vehicle;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class VehicleDeserializer extends JsonDeserializer<Vehicle> {

    @Override
    public Vehicle deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        if (jsonNode.has("")){

        }
        return null;
    }
}
