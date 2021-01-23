package com.epam.service;

import com.epam.dto.AddressDTO;
import com.epam.entity.Address;
import com.epam.repository.AddressRepository;
import com.epam.repository.AddressRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class AddressServiceImpl implements AddressService<AddressDTO>, ConverterService<Address, AddressDTO> {

    private AddressRepository repository = new AddressRepositoryImpl();

    @Override
    public void findOne(AddressDTO addressDTO) {
        Address address = convertToEntity(addressDTO);
        repository.getOneByCityName(address);
    }

    @Override
    public void getAll() {
        repository.getAll();
    }

    @Override
    public void saveOne(AddressDTO addressDTO) {
        Address address = convertToEntity(addressDTO);
        repository.saveOne(address);
    }

    @Override
    public void saveAll(List<AddressDTO> newAddresses) {
        List<Address> addresses = new ArrayList<>();
        for (AddressDTO addressDTO : newAddresses) {
            addresses.add(convertToEntity(addressDTO));
        }
        repository.saveAll(addresses);
    }

    @Override
    public Address convertToEntity(AddressDTO addressDTO) {
        return new Address(addressDTO.getCityName(), addressDTO.getStreet(), addressDTO.getHouseNumber(), addressDTO.getFlatNumber());
    }

    @Override
    public AddressDTO convertToDTO(Address address) {
        return new AddressDTO(address.getCityName(), address.getStreet(), address.getHouseNumber(), address.getFlatNumber());
    }
}
