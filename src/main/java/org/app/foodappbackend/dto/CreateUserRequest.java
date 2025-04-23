package org.app.foodappbackend.dto;

import java.util.Set;

public class CreateUserRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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