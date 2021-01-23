package com.epam.service;

import com.epam.dto.AddressDTO;
import com.epam.entity.Address;
import com.epam.entity.Human;
import com.epam.dto.HumanDTO;
import com.epam.repository.HumanRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class HumanServiceImpl implements HumanService<HumanDTO>, ConverterService<Human, HumanDTO> {

    private HumanRepositoryImpl repository = new HumanRepositoryImpl();

    @Override
    public void findOne(HumanDTO humanDTO) {
        Human human = convertToEntity(humanDTO);
        repository.getOneByName(human);
    }

    @Override
    public void getAll() {
        repository.getAll();
    }

    @Override
    public void saveOne(HumanDTO humanDTO) {
        Human human = convertToEntity(humanDTO);
        repository.saveOne(human);
    }

    @Override
    public void saveAll(List<HumanDTO> dtoList) {
        List<Human> humans = new ArrayList<>();
        for (HumanDTO humanDTO : dtoList) {
            humans.add(convertToEntity(humanDTO));
        }
        repository.saveAll(humans);
    }

    @Override
    public Human convertToEntity(HumanDTO humanDTO) {
        Address address = new Address(humanDTO.getAddressDTO().getCityName(), humanDTO.getAddressDTO().getStreet(), humanDTO.getAddressDTO().getHouseNumber(), humanDTO.getAddressDTO().getFlatNumber());
        return new Human(humanDTO.getId(), humanDTO.getName(), humanDTO.getBirthDate(), address);
    }

    @Override
    public HumanDTO convertToDTO(Human human) {
        AddressDTO addressDTO = new AddressDTO(human.getAddress().getCityName(), human.getAddress().getStreet(), human.getAddress().getHouseNumber(), human.getAddress().getFlatNumber());
        return new HumanDTO(human.getId(), human.getName(), human.getBirthDate(), addressDTO);
    }

}
