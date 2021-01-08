package com.epam.dto;

import com.epam.entity.Address;
import com.epam.service.DTOService;

import java.util.ArrayList;
import java.util.List;

public class AddressDTO implements DTOService<AddressDTO, Address> {
    private String cityName;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public AddressDTO(String cityName, String street, int houseNumber, int flatNumber) {
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
    public String toString() {
        return cityName + " " + street + " " + houseNumber + " " + flatNumber;
    }

    @Override
    public AddressDTO getDTO() {
        return new AddressDTO(cityName, street, houseNumber, flatNumber);
    }

    @Override
    public List<AddressDTO> getAllDTO() {
        return new ArrayList<AddressDTO>();
    }

    @Override
    public void safeDTO(AddressDTO addressDTO) {
        System.out.println(addressDTO);
    }

    @Override
    public void safeAllDTO(List<AddressDTO> dto_list) {
        for (AddressDTO addressDTO : dto_list) {
            System.out.println(addressDTO);
        }
    }

    @Override
    public Address convertToEntity(AddressDTO dto) {
        return new Address(dto.getCityName(), dto.getStreet(), dto.getHouseNumber(), dto.getFlatNumber());
    }
}
