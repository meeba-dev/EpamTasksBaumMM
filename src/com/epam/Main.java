package com.epam;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("1)  Создание 10ти объектов и заполнение ими контейнера ArrayList:");
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Michael", 28, new Human.Address("Togliatti", "Tupoleva Blvd", 15, 102)));
        humans.add(new Human("Andrew", 33, new Human.Address("Berlin", "Moritzstrasse", 5, 29)));
        humans.add(new Human("Peter", 41, new Human.Address("London", "Baker Street", 221, 1)));
        humans.add(new Human("Peter", 41, new Human.Address("London", "Baker Street", 221, 1)));
        humans.add(new Human("Alexander", 20, new Human.Address("Prague", "Brabcova Street", 1159, 2)));
        humans.add(new Human("Alexander", 20, new Human.Address("Prague", "Brabcova Street", 1159, 2)));
        humans.add(new Human("Zinedine", 49, new Human.Address("Anchorage", "Arctic Blvd", 1901, 1)));
        humans.add(new Human("Emma", 22, new Human.Address("Prague", "Belehradska", 663, 2)));
        humans.add(new Human("Julia", 47, new Human.Address("Warsaw", "Olimpijska", 15, 1)));
        humans.add(new Human("Julia", 47, new Human.Address("Warsaw", "Olimpijska", 15, 1)));

        for (Human human : humans) {
            System.out.println(human);
        }
        System.out.println("2) Поиск и вывод дублей:");
        for (int i = 0; i < humans.size() - 1; i++) {
            Human currentHuman = humans.get(i);
            Human nextHuman = humans.get(i + 1);
            if (currentHuman.equals(nextHuman)) {
                System.out.println(nextHuman);
            }
        }
        System.out.println("3) Удаление дублей и вывод нового состояние коллекции ArrayList:");
        for (int i = 0; i < humans.size() - 1; i++) {
            Human currentHuman = humans.get(i);
            Human nextHuman = humans.get(i + 1);
            if (currentHuman.equals(nextHuman)) {
                humans.remove(nextHuman);
            }
        }
        for (Human human : humans) {
            System.out.println(human);
        }
        System.out.println("4) Сортировка людей по имени:");
        List<Human> humansSortedByName = sortHumansByName(humans);
        for (Human human : humansSortedByName) {
            System.out.println(human);
        }
        System.out.println("5) Сортировка людей по возрасту:");
        List<Human> humansSortedByAge = sortHumansByAge(humans);
        for (Human human : humansSortedByName) {
            System.out.println(human);
        }
        System.out.println("6) Сортировка людей по полному адресу:");
        List<Human> humansSortedByAddress = sortHumansByAddress(humans);
        for (Human human : humansSortedByName) {
            System.out.println(human);
        }
        System.out.println("8) Метод для вывода пользователя по его роли:");
        User user = new User("Mikhail", Role.ADMIN.getDescription());
        user.sayHello();
        System.out.println("9) Сортировка HashMap по ключу:");
        // создание и генерация значений hashmap
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Alphabet");
        map.put(7, "Bucket");
        map.put(1, "Junkyard");
        map.put(5, "Firewood");
        map.put(3, "Ziplock");
        map.put(2, "Yacht");
        map.put(6, "Cloud");
        System.out.println(sortMapByKey(map));
        System.out.println("10) Сортировка HashMap по значению:");
        System.out.println(sortMapByValue(map));
        System.out.println("11) Генерация случайных значений в LinkedList и их вывод:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        // генерация и запись случайных значений
        for (int i = 0; i < 10; i++) {
            linkedList.add(new Random().nextInt(100));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Index: " + i + " Value: " + linkedList.get(i));
        }
        System.out.println();
    }

    private static List<Human> sortHumansByName(List<Human> list) {
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return list;
    }

    private static List<Human> sortHumansByAge(List<Human> list) {
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        return list;
    }

    private static List<Human> sortHumansByAddress(List<Human> list) {
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                int result = o1.getAddress().city.compareTo(o2.getAddress().city);
                if (result == 0) {
                    result = o1.getAddress().street.compareTo(o2.getAddress().street);
                    if (result == 0) {
                        if (o1.getAddress().houseNumber > o2.getAddress().houseNumber) {
                            result = 1;
                        }
                        else if (o1.getAddress().houseNumber < o2.getAddress().houseNumber) {
                            result = -1;
                        }
                        else {
                            if (o1.getAddress().flatNumber > o2.getAddress().flatNumber) {
                                result = 1;
                            }
                            else if (o1.getAddress().flatNumber < o2.getAddress().flatNumber) {
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
        });
        return list;
    }

    private static Map<Integer, String> sortMapByKey(Map<Integer, String> unsortedMap) {
        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(unsortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    private static Map<Integer, String> sortMapByValue(Map<Integer, String> unsortedMap) {
        List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(unsortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
