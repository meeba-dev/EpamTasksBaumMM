package com.epam.entity;


import com.epam.dto.HumanDTO;
import com.epam.service.EntityService;

import java.util.ArrayList;
import java.util.List;

public class Human implements EntityService<Human, HumanDTO> {
    private int id;
    private String name;
    private Address address;
    private String birthDate;

    public Human(int id, String name, Address address, String birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
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
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Human getEntity() {
        return new Human(id, name, address, birthDate);
    }

    @Override
    public List<Human> getAllEntities() {
        return new ArrayList<Human>();
    }

    @Override
    public void safeEntity(Human entity) {
        System.out.println(entity);
    }

    @Override
    public void safeEntities(List<Human> humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    @Override
    public HumanDTO convertToDTO(Human entity) {
        return new HumanDTO(entity.getId(), entity.getName(), entity.getAddress().convertToDTO(address), entity.getBirthDate());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + birthDate;
    }
}
