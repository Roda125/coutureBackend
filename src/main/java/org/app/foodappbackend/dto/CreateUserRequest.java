package org.app.foodappbackend.dto;

import java.util.Set;

public class CreateUserRequest {
    private String email;
    private String image;
    private String password;
    private Set<Long> RopaIds; // IDs de los Ropas asociados

    // Getters y Setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Long> getRopaIds() {
        return RopaIds;
    }

    public void setRopaIds(Set<Long> RopaIds) {
        this.RopaIds = RopaIds;
    }
}