package org.app.foodappbackend.dto;

import org.app.foodappbackend.models.Ropa;

class RopaDTO {

    private Long id;
    private String name;
    private String description;
    private String image;

    public RopaDTO(Ropa Ropa) {
        this.id = Ropa.getId();
        this.name = Ropa.getName();
        this.description = Ropa.getDescription();
        this.image = Ropa.getImage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
