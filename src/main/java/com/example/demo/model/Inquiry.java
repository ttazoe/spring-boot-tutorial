package com.example.demo.model;

import javax.validation.*;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Inquiry {
    // Required, Max 60 characters
    @NotBlank
    @Size(max = 60)
    private String name;

    // Required, Email format, Max 254 characters
    @NotBlank
    @Email
    @Size(max = 254)
    private String email;

    // Required, Max 500 characters
    @NotBlank
    @Size(max = 500)
    private String inquiry;
}
