package org.app.foodappbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/Couture")
public class Home {

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Bienvenido a la API de FoodApp!");
    }
}
