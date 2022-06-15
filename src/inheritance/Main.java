package inheritance;

public class Main {
    public static void main(String[] args) {
        Cohort cohort = new Cohort();
        Person person = new Person("Amos",30,Gender.MALE,MaritalStatus.SINGLE);
        Ancestor a = new Ancestor("Amos", 30,Gender.MALE,MaritalStatus.SINGLE,cohort,"Semicolon");
        Native b = new Native("Khaled", 32, Gender.NON_BINARY,MaritalStatus.COMPLICATED,cohort);
        System.out.println(person);
        System.out.println(a);
        System.out.println(b);
    }
}
