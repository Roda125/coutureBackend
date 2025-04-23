package org.app.foodappbackend.controllers;

import org.app.foodappbackend.models.Ropa;
import org.app.foodappbackend.services.RopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/ropa")
public class RopaController {

    @Autowired
    private RopaService ropaService;

    @PostMapping("/create")
    public ResponseEntity<Ropa> createRopa(@RequestBody Ropa ropa) {
        Ropa createdRopa = ropaService.createRopa(ropa);
        return ResponseEntity.ok(createdRopa);
    }

    @GetMapping
    public ResponseEntity<List<Ropa>> getAllRopa() {
        List<Ropa> ropa = ropaService.getAllRopa();
        return ResponseEntity.ok(ropa);
    }
}
