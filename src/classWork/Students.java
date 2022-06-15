package classWork;

import java.util.ArrayList;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String address;
    private static int id = 100;
    private final int studentId;
    private static ArrayList<Courses> studentCourseList;
//    private int phoneNumber;

    public Students(String firstName, String lastName, int age, String gender, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        studentId = id++;
        studentCourseList = new ArrayList<>();

    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    public int getStudentId(){
        return studentId;
    }
    public static ArrayList<Courses> setStudentCourseList(){
        return studentCourseList;
    }
    public static void getStudentCourseList(){
        for (Courses course: studentCourseList){
            System.out.println(course);
        }
    }

    @Override
    public String toString(){
        return ("StudentID: " + studentId+
                "\nName: "+ firstName+ " "+ lastName+
                "\nAge: " + age+
                "\nGender: "+ gender+
                "\nAddress: "+ getAddress()+
                "\nCourses offered: "+ setStudentCourseList());

    }


    public void resetId() {
        id = 100;
    }
}
