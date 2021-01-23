package com.epam.repository;

import com.epam.entity.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressRepositoryImpl implements AddressRepository<Address> {

    private List<Address> addresses = new ArrayList<>();

    @Override
    public Address getOneByCityName(Address address) {
        String cityName = address.getCityName();
        for (Address a : addresses) {
            if (a.getCityName().equals(cityName)) {
                System.out.println("Address is found: " + a);
                return a;
            }
        }
        System.out.println("Address is not found");
        return null;
    }

    @Override
    public void getAll() {
        System.out.println("Addresses are stored: ");
        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    @Override
    public void saveOne(Address address) {
        System.out.println("Address was saved: " + address);
        addresses.add(address);
    }

    @Override
    public void saveAll(List<Address> newAddresses) {
        System.out.println("Addresses were saved: ");
        for (Address address : newAddresses) {
            System.out.println(address);
        }
        addresses.addAll(newAddresses);
    }
}
