package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAdress() {
        return adress;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void happyBirthday() {
        if (hasAge( )) {
            setAge(getAge( ).getAsInt( ) + 1);
        }
    }

    boolean hasAge() {
        return getAge( ).isPresent( );
    }

    boolean hasAddress() {
        return adress == null ? false : true;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder( ).setSurname(surname).setAddress(adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

}
