package inheritance;

import ehis_tutorial.Ancestor;

public class Main {
    public static void main(String[] args) {
        Cohort cohort = new Cohort();
        Person person = new Person("Amos",30,Gender.MALE,MaritalStatus.SINGLE);
        System.out.println(person.getName());
    }
}
