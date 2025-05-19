package org.app.foodappbackend.controllers;

import org.app.foodappbackend.models.Users;
import org.app.foodappbackend.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UsersController {

    @Autowired
    private UsersService userService;

    @PostMapping
    public ResponseEntity<Users> registerUser(@RequestBody Users users) {
        Users newUser = userService.registerUser(users);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable Long id) {
        Users users = userService.findById(id);
        return users != null ? ResponseEntity.ok(users) : ResponseEntity.notFound().build();
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Users> getUsersByEmail(@PathVariable String email) {
        Users users = userService.getUsersByEmail(email);

        return users != null ? ResponseEntity.ok(users) : ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}