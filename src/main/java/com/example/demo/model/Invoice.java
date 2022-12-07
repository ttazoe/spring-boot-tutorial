package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Invoice {
    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    @Size(max = 254)
    private String address;

    @NotBlank
    @Pattern(regexp = "[0-9]*")
    private String phoneNumber;

    @NotNull
    @Min(1000)
    @NumberFormat(pattern = "#,###")
    private BigDecimal price;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate paymentDeadline;
}
