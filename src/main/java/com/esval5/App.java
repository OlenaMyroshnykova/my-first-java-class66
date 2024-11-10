package com.esval5;


public final class App {
    public static void main(String[] args) {
        Person person1 = new Person("Mike", "Wazowski", "1111111111", 1980, "Neverland", 'H');
        Person person2 = new Person("Sully", "Salt", "2222222222", 1983,  "Neverland", 'H');

        System.out.println("Person 1:");
        person1.printAttributes();

        System.out.println("\nPerson 2:");
        person2.printAttributes();
    }
}
