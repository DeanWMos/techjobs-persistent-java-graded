package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.validation.constraints.NotBlank;

@Entity

public class Employer extends AbstractEntity {
    @NotBlank
    @Length(min = 1, max = 100)
    public String location;

    public Employer() {}

    public void setLocation(String location) {
        this.location = location;
    }


}
