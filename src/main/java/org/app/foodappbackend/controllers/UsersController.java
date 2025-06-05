package org.app.foodappbackend.controllers;

import org.app.foodappbackend.dto.CreateUserRequest;
import org.app.foodappbackend.dto.LoginRequest;
import org.app.foodappbackend.models.Users;
import org.app.foodappbackend.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UsersController {

    @Autowired
    private UsersService userService;

    @PostMapping("/registro")
    public ResponseEntity<?> registerUser(@RequestBody CreateUserRequest user) {
        try {
            Users newUser = userService.registerUser(user);
            return ResponseEntity.ok(newUser);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/test")
    public ResponseEntity<?> testFunction() {
        return ResponseEntity.ok("Conexión exitosa");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginData) {
        Optional<Users> user = userService.getUsersByEmail(loginData.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(loginData.getPassword())) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no encontrado");
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
        Optional<Users> user = userService.getUsersByEmail(email);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
