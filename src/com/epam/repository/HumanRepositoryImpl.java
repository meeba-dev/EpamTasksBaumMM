package com.epam.repository;

import com.epam.entity.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanRepositoryImpl implements HumanRepository<Human> {

    private List<Human> humans = new ArrayList<>();

    @Override
    public Human getOneByName(Human human) {
        String name = human.getName();
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                System.out.println("User was found: " + h);
                return h;
            }
        }
        System.out.println("User is not found");
        return null;
    }

    @Override
    public void getAll() {
        System.out.println("Users are stored: ");
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    @Override
    public void saveOne(Human human) {
        System.out.println("User was saved: " + human);
        humans.add(human);
    }

    @Override
    public void saveAll(List<Human> newHumansList) {
        System.out.println("Users were saved: ");
        for (Human human : newHumansList) {
            System.out.println(human);
        }
        humans.addAll(newHumansList);
    }
}
