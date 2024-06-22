package com.springRestAPI.RestFul.controllers;

import jakarta.servlet.http.HttpSession;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("User")
@Log
public class Homecontroller {
    @GetMapping("/Home")
    public ResponseEntity<Void> homeIntializr(HttpSession session)
    {
        log.info("Home Method Intialized");
        String Name="Ritesh";
        session.setAttribute("Name",Name);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/User/homePage"))
                .build();
    }
}
