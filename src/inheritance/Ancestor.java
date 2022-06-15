package ehis_tutorial;

import inheritance.Cohort;
import inheritance.Gender;
import inheritance.MaritalStatus;
import inheritance.Native;

public class Ancestor extends Native {
    private String workPlace;
    public Ancestor(String name, int age, Gender gender, MaritalStatus maritalStatus, Cohort cohort, String workPlace){
        super(name, age, gender, maritalStatus, cohort);
        this.workPlace = workPlace;
    }
}
