package com.epam.entity;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String cityName;
    private String street;
    private int houseNumber;
    private int flatNumber;

    @Override
    public String toString() {
        return cityName + " " + street + " " + houseNumber + " " + flatNumber;
    }
}
