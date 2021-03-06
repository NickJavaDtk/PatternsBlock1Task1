package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;
    protected Person person;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        }
        throw new IllegalArgumentException("Возраст не может быть меньше нуля");

    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    Person build() {
        if (name != null && surname != null && age >= 0 && adress != null) {
            return new Person(name, surname, age, adress);
        } else if (name != null && surname != null && age >= 0) {
            return new Person(name, surname, age);
        }
        throw new IllegalStateException("Имя и фамилия обязательны для ввода");
    }


}
