package com.basic.interfacceexample;

import java.util.Scanner;

public class AnimalMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("animal name for animal sound (\n1. Dog, \n 2.Cat ,\n3 .KingKongMonkey)");
        String input = sc.nextLine();
        System.out.println("Animal name is " + input);

        Animal animal = null;
        if (input.equalsIgnoreCase("dog")) {
            animal = new Dog();
        } else if (input.equalsIgnoreCase("Cat")) {
            animal = new Cat();
        } else if (input.equalsIgnoreCase("KingKongMonkey")) {
            animal = new KingKongMonkey();
        } else {
            System.out.println("entered name is not correct or not in list ");
        }
        if (animal != null) {
            animal.sound();
        }


    }


}
