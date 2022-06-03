package inheritance;

public class Native extends Person {
   private Cohort cohort;
    public Native(String name, int age, Gender gender, MaritalStatus maritalStatus, Cohort cohort){
        super(name, age, gender, maritalStatus);
        this.cohort = cohort;
    }

}
