package com.esval5;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;

    public Person(String firstName, String lastName, String idNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }

    public void printAttributes() {
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de documento de identidad: " + idNumber);
        System.out.println("Año de Nacimiento: " + birthYear);
    }
}
