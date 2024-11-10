package com.esval5;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String countryOfBirth;
    private char gender;

    public Person(String firstName, String lastName, String idNumber, int birthYear, String countryOfBirth, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
         return lastName;
    }
    
    public String getIdNumber(){
        return idNumber;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public String getCountryOfBirth(){
        return countryOfBirth;
    }

    public char getGender(){
        return gender;
    }

    public void printAttributes() {
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de documento de identidad: " + idNumber);
        System.out.println("Año de Nacimiento: " + birthYear);
        System.out.println("País de Nacimiento: " + countryOfBirth);
        System.out.println("Género: " + gender);
    }
}
