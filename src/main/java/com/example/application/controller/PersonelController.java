package com.example.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.service.PersonelService;

@RestController
@RequestMapping("/personel")
public class PersonelController {

    private PersonelService personelService;

    PersonelController(PersonelService personelService){
        this.personelService = personelService;
    }
    
}
