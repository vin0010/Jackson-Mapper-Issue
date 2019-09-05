package com.codex.jacksonautowiring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(path = "/jacksontest", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void test (@RequestBody TestObject testObject){
        System.out.println("Deserialization successful");
    }
}
