package com.epam.entity;



import com.epam.dto.AddressDTO;
import com.epam.service.EntityService;

import java.util.ArrayList;
import java.util.List;

public class Address implements EntityService<Address, AddressDTO> {
    private String cityName;
    private String street;
    private int houseNumber;
    private int flatNumber;
    public Address(String cityName, String street, int houseNumber, int flatNumber) {
        this.cityName = cityName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public int getFlatNumber() {
        return flatNumber;
    }
    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public Address getEntity() {
        return new Address(cityName, street, houseNumber, flatNumber);
    }

    @Override
    public List<Address> getAllEntities() {
        return new ArrayList<Address>();
    }

    @Override
    public void safeEntity(Address address) {
        System.out.println(address);
    }

    @Override
    public void safeEntities(List<Address> addresses) {
        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    @Override
    public AddressDTO convertToDTO(Address entity) {
        return new AddressDTO(entity.getCityName(), entity.getStreet(), entity.getHouseNumber(), entity.getFlatNumber());
    }

    @Override
    public String toString() {
        return cityName + " " + street + " " + houseNumber + " " + flatNumber;
    }
}
