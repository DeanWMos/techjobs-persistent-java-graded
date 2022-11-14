package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
public class Employer extends AbstractEntity {
    @NotBlank
    @Length(min = 1, max = 125)
    public String location;

    public Employer() {}

    public void setLocation(String location) {
        this.location = location;
    }


}
