package org.launchcode.javawebdevtechjobspersistent.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    }

    public Employer(String location) {
        this.location = location;
    }

    @NotNull
    @NotBlank(message = "Location is required.")
    @Size(min = 2, max = 80, message = "Location must be between 2 and 80 characters.")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
