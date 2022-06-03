package inheritance;

import inheritance.Gender;
import inheritance.MaritalStatus;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, int age, Gender gender, MaritalStatus maritalStatus) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName(){
        return name;
    }
}
