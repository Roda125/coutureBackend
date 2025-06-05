package org.app.foodappbackend.dto;

public class CreateUserRequest {
    private String email;
    private String nombre;
    private String password;

    public CreateUserRequest(String email, String nombre, String password) {
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}