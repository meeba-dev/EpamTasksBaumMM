package com.epam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String name;
    private String roleType;

    public void sayHello() {
        System.out.println("Hello " + name + ". You are " + roleType);
    }
}
