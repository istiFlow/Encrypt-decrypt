package com.company;

public class Main {

    public static void main(String[] args) {

        Caesar c = new Caesar();
        System.out.println(c.enrypt("abcdef",2));

        System.out.println(c.decrypt("cdefgh",2));

    }
}
