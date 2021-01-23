package com.epam.service;

import com.epam.dto.HumanDTO;

import java.util.List;

public interface HumanService<T> {

    public void findOne(T dto);
    public void getAll();
    public void saveOne(T dto);
    public void saveAll(List<T> dtoList);

}
