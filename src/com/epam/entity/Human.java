package com.epam.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Human {
    private int id;
    private String name;
    private String birthDate;
    private Address address;

    @Override
    public String toString() {
        return id + " " + name + " " + birthDate + " " + address;
    }
}
