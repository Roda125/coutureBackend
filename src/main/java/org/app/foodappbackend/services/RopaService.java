package org.app.foodappbackend.services;

import org.app.foodappbackend.models.Ropa;
import org.app.foodappbackend.repositories.RopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RopaService {

    @Autowired
    private RopaRepository RopaRepository;

    public Ropa createRopa(Ropa ropa) {
        return RopaRepository.save(ropa);
    }

    public List<Ropa> getAllRopa() {
        return RopaRepository.findAll();
    }

    public List<Ropa> setAllRopa(){
        return RopaRepository.findAll();
    }

}
