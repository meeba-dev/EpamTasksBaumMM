package com.epam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Human implements Comparable<Human>{

    private String name;
    private Integer age;
    private Address address;

    @Override
    public int compareTo(Human human) {
        int result = this.address.city.compareTo(human.address.city);
        if (result == 0) {
            result = this.address.street.compareTo(human.address.street);
            if (result == 0) {
                if (this.address.houseNumber > human.address.houseNumber) {
                    result = 1;
                }
                else if (this.address.houseNumber < human.address.houseNumber) {
                    result = -1;
                }
                else {
                    if (this.address.flatNumber > human.address.flatNumber) {
                        result = 1;
                    }
                    else if (this.address.flatNumber < human.address.flatNumber) {
                        result = -1;
                    }
                    else {
                        result = 0;
                    }
                }
            }
        }
        return result;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor  

    public static class Address {
        String city;
        String street;
        int houseNumber;
        int flatNumber;

        @Override
        public String toString() {
            return city + " " + street + " " + houseNumber + " " + flatNumber;
        }
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Human human2 = (Human) obj;
        return this.name.equals(human2.name) && this.age == human2.age &&
                this.address.city.equals(human2.address.city) && this.address.street.equals(human2.address.street) &&
                this.address.houseNumber == human2.address.houseNumber && this.address.flatNumber == human2.address.flatNumber;
    }

}
