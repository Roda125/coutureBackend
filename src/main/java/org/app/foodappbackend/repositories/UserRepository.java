package org.app.foodappbackend.repositories;

import org.app.foodappbackend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Método para buscar un usuario por su correo electrónico
    Optional<Users> findByEmail(String email);
}
