package com.epam.dto;


import com.epam.entity.Human;
import com.epam.service.DTOService;

import java.util.ArrayList;
import java.util.List;

public class HumanDTO implements DTOService<HumanDTO, Human> {

    private int id;
    private String name;
    private AddressDTO addressDTO;
    private String birthDate;

    public HumanDTO(int id, String name, AddressDTO addressDTO, String birthDate) {
        this.id = id;
        this.name = name;
        this.addressDTO = addressDTO;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + addressDTO + " " + birthDate;
    }

    @Override
    public HumanDTO getDTO() {
        return new HumanDTO(id, name, addressDTO, birthDate);
    }

    @Override
    public List<HumanDTO> getAllDTO() {
        return new ArrayList<HumanDTO>();
    }

    @Override
    public void safeDTO(HumanDTO entity) {
        System.out.println(entity);
    }

    @Override
    public void safeAllDTO(List<HumanDTO> humans) {
        for (HumanDTO humanDTO : humans) {
            System.out.println(humanDTO);
        }
    }

    @Override
    public Human convertToEntity(HumanDTO dto) {
        return new Human(dto.getId(), dto.getName(), dto.getAddressDTO().convertToEntity(addressDTO), dto.getBirthDate());
    }


}
