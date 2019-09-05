package com.codex.jacksonautowiring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @RequestMapping(path = "/jackson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void forSingleObject(@RequestBody Vehicle vehicle){
        System.out.println("Deserialization successful");
    }
}
