package com.epam;

public class Main {

    public static void main(String[] args) {
        // Homework #1
        System.out.println("Hello world!");
        String str = "testString";
        System.out.println("1) String length: " + str.length());
        String str2 = "anotherString";
        System.out.println("2) String comparison: ");
        System.out.println("Is testString longer than anotherString?" + str.equalsIgnoreCase(str2));
        String string = new String("objectString");
        string.intern();
        System.out.println("3) String from String pool: " + string);
        char[] charArray = string.toCharArray();
        System.out.println("4) Char array: " );
        for (char ch : charArray)
            System.out.print(ch + " ");
        System.out.println();
        byte[] byteArray = string.getBytes();
        System.out.println("5) Byte array: ");
        for (byte bt : byteArray)
            System.out.print(bt + " ");
        System.out.println();
        System.out.println("6) Convert to uppercase: " + string.toUpperCase());
        String str3 = "Barcelona";
        System.out.println("7) The position of first \"a\" in Barcelona: " + str3.indexOf("a"));
        System.out.println("8) The position of last \"a\" in Barcelona: " + str3.lastIndexOf("a"));
        System.out.println("9) Is Barcelona contain a word \"Sun\"? " + str3.contains("Sun"));
        System.out.println("10) Is Barcelona end with word \"Oracle\"? " + str3.endsWith("Oracle"));
        System.out.println("11) Is Barcelona start with word \"Java\"? " + str3.startsWith("Java"));
        System.out.println("12) Replacing all \"a\" to \"o\" in Barcelona: " + str3.replace("a", "o"));
        String hugeText = "Huge text in order to demonstrate how substring function works. " +
                "I need to write as much as possible, because in task I need the substring from 44 to 90. " +
                "It means I need to have not less than 90 symbols in string.";
        System.out.println("13) Substring from 44 to 90 symbol: " + hugeText.substring(44, 90));
        String str4 = "Demonstrating split function";
        String[] strArray = str4.split(" ", 3);
        System.out.println("14) Splitting string by space to 3 separated strings: ");
        for (String s : strArray)
            System.out.println(s);
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str4);
        System.out.println("15) Reversing the order of symbols in string: " + strBuilder.reverse());
    }
}
