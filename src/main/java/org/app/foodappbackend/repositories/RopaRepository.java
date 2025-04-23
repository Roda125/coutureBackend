package org.app.foodappbackend.repositories;

import org.app.foodappbackend.models.Ropa;
import org.app.foodappbackend.models.Ropa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Long> {
    Ropa findByName(String name);
}