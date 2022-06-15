package chapter7;

public class MySchoolMain {
    public static void main(String[] args) {
        MySchool newSchool = new MySchool();
        newSchool.setName();
        newSchool.setSubjects();
        newSchool.setScores();
        newSchool.setTotal();
        newSchool.displayOutput();
        newSchool.displaySubjectSummary();
    }

}
