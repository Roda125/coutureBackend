package org.app.foodappbackend.repositories;

import org.app.foodappbackend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);  // Busca un usuario por su email
}
