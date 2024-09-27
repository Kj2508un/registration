package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class RegistrationDto {
    @NotEmpty(message = "this field should not be empty")
    @Size(min = 2,message = "enter minimum two letters")
    private String name;

    @Email(message = "please enter the the correct email format")
    private String email;

    @Size(min = 10,max = 10,message = "should be ten digits")
    private String mobile;



}