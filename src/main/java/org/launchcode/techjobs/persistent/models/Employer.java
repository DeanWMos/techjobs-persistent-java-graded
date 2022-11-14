package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min =3, max = 77)
    public String location;

    public String getLocation(){
        return location;
    }

    public Employer() {}

    public void setLocation(String location) {
        this.location = location;
    }


}
