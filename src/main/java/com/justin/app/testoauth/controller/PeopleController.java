package com.justin.app.testoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @GetMapping(path = "/people")
    public String getPeople(){
        return "Hi People";
    }

    @GetMapping(path = "/folks")
    public String getFolks(){
        return "Hi Folks";
    }
}
