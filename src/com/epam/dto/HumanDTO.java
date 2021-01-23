package com.epam.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class HumanDTO {
    private int id;
    private String name;
    private String birthDate;
    private AddressDTO addressDTO;
}
