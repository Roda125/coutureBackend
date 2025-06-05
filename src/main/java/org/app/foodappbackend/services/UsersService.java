package org.app.foodappbackend.services;

import org.app.foodappbackend.dto.CreateUserRequest;
import org.app.foodappbackend.models.Users;
import org.app.foodappbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UserRepository userRepository;


    @Autowired
    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public Optional<Users> getUsersByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Users registerUser(CreateUserRequest new_user) {

        Optional<Users> prov = this.userRepository.findByEmail(new_user.getEmail());

        if (prov.isEmpty()) {
            Users user = new Users();

            user.setNombre(new_user.getNombre());
            user.setEmail(new_user.getEmail());
            user.setPassword(new_user.getPassword());

            return userRepository.save(user);
        }
        else {
            throw new IllegalArgumentException("Usuario ya existe en la base de datos");
        }
    }

}
