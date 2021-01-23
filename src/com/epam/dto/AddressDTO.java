package com.epam.dto;

import com.epam.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AddressDTO {
    private String cityName;
    private String street;
    private int houseNumber;
    private int flatNumber;
}
