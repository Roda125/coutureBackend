package org.app.foodappbackend.dto;

import org.app.foodappbackend.models.Ropa;
import org.app.foodappbackend.models.Users;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LoginResponse {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String token;
    private Set<RopaDTO> Ropas;

    public LoginResponse(Users user, String token) {

        this.email = user.getEmail();
        this.password = user.getPassword();
        this.token = token;
        this.Ropas = user.getRopas().stream()
                .map(ropa -> new RopaDTO((Ropa) ropa))
                .collect(Collectors.toSet());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<RopaDTO> getRopas() {
        return Ropas;
    }

    public void setRopas(Set<RopaDTO> Ropas) {
        this.Ropas = Ropas;
    }
}
