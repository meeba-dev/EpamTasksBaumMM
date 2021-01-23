package com.epam;


import com.epam.dto.AddressDTO;
import com.epam.dto.HumanDTO;
import com.epam.entity.Address;
import com.epam.repository.HumanRepositoryImpl;
import com.epam.service.AddressServiceImpl;
import com.epam.service.HumanServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AddressDTO addressDTO = new AddressDTO("Togliatti", "Kurchatova Blvd", 15, 10);
        HumanDTO humanDTO = new HumanDTO(1, "Andrew", "19.10.90", addressDTO);
        HumanServiceImpl service = new HumanServiceImpl();
        service.saveOne(humanDTO);
        HumanDTO humanDTO1 = new HumanDTO(2, "Alexander", "01.02.93", new AddressDTO("Moscow", "Tverskaya Street", 5, 81));
        List<HumanDTO> list = new ArrayList<HumanDTO>();
        list.add(humanDTO);
        list.add(humanDTO1);
        service.saveAll(list);
        service.getAll();
        service.findOne(humanDTO);
        AddressServiceImpl addressService = new AddressServiceImpl();
        addressService.saveOne(addressDTO);
        AddressDTO addressDTO1 = new AddressDTO("Barcelona", "Bridge Street", 9, 101);
        addressService.saveOne(addressDTO1);
        addressService.getAll();
        List<AddressDTO> list1 = new ArrayList<>();
        list1.add(addressDTO);
        list1.add(addressDTO1);
        addressService.saveAll(list1);
        addressService.findOne(addressDTO1);
        addressService.getAll();
    }
}
