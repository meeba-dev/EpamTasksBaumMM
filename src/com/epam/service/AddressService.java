package com.epam.service;

import com.epam.dto.AddressDTO;
import com.epam.entity.Address;

import java.util.List;

public interface AddressService<T> {

    public void findOne(T dto);
    public void getAll();
    public void saveOne(T dto);
    public void saveAll(List<T> dtoList);
}
