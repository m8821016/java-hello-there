package com.dockerbyexample;

import java.util.Random;

public class HelloThere {
    final static String NAME[] = {"Laurus", "Tilia", "Elliottia", "Hill", "Douglas"};
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Hello there! " + NAME[rand.nextInt(NAME.length)]);
    }
}
