package classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static School school;
    private static Students student;
//    private static Students student;
    public static void main(String... args) {
        school = new School("Yaba Technical College", "Yaba");
        System.out.println("Welcome to Yaba Tecnical College");
        String menu = ("""
                1 -> School Portal
                2 -> Student Portal
                3 -> View available Courses
                4 -> Exit
                """);
        int sentinel = 0;
        while (sentinel != -1){
        System.out.println(menu);
        int userInput = input.nextInt();
        if (userInput == 4){
            sentinel = -1;
        }
        else {
            switch (userInput){
                case 1 -> schoolPortal();
                case 2 -> studentPortal();
                case 3 -> {
                    ArrayList<Courses>courses = school.getAllCourses();
                    for (Courses course: courses)
                        System.out.println(course);
                }
            }
        }

        }


    }

    public static void studentPortal(){
        System.out.println("Welcome to student portal");
        String menu = ("""
                1 -> Register course
                2 -> View Registered Courses
                3 -> Delete course
                4 -> Withdraw form school
                0 -> Back
                """);
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println(menu);
            int userInput = input.nextInt();
            if (userInput == 0){
                sentinel = -1;
            }
            else {
                switch (userInput){
                    case 1 -> selectCourse();
                    case 2 -> Students.getStudentCourseList();
                    case 3 -> deleteCourse();
                    case 4 -> withdraw();

                }
            }
        }
    }

    private static void withdraw() {
        school.expelStudent(student.getStudentId());
    }

    private static void deleteCourse() {
        Courses courseFound = null;
        System.out.println("Enter course to delete");
        String  userInput = input.next();
        for (Courses course: Students.setStudentCourseList()){
            if (userInput.equalsIgnoreCase(course.getCourseName())){
                courseFound = course;
            }
            else throw new IllegalArgumentException(courseFound+ " not found in your course list.");
        }
    }


    private static void selectCourse() {
        ArrayList<Courses> coursesList = school.getAllCourses();
        Courses courseFound = null;
        System.out.println("Enter a course to register");
        String userInput = input.next();
        for (Courses course: coursesList){
            if (userInput.equalsIgnoreCase(course.getCourseName())){
                courseFound = course;
            }
            else throw new IllegalArgumentException("Course not found in School database.");
        }
        Students.setStudentCourseList().add(courseFound);
    }

    public static void schoolPortal() {
        String menu = ("""
                Welcome to Yaba Tech.
                1 -> Add new student
                2 -> Add courses
                3 -> View all Students
                4 -> Expel a student
                5 -> Back
                0 -> Exit
                """);
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println(menu);
            int userInput = input.nextInt();
            if (userInput == 0){
                sentinel = -1;
            }
            else {
                switch (userInput){
                    case 1 -> createStudent();
                    case 2 -> addCourses();
                    case 3 -> viewAllStudent();
                    case 4 -> expelStudent();
                    case 5 -> sentinel =-1;
                    default -> {
                        System.out.println("Incorrect input, try again");
                        sentinel = -1;
                    }
                }
            }

        }
    }
    public static void createStudent() {
        boolean continueloop = true;

        while (continueloop){
            System.out.println("Enter first name: ");
            String firstName = input.next();
            System.out.println("Enter last name: ");
            String lastName = input.next();
            System.out.println("Enter your age: ");
            int age = input.nextInt();
            System.out.println("Enter gender. male or female: ");
            String gender = input.next();
            System.out.println("Enter address: ");
            input.nextLine();
            String address = input.nextLine();
            Students student = new Students(firstName, lastName, age, gender, address);
            school.addStudent(student);
            System.out.println(firstName + " " + lastName + " successfully created");
            System.out.println("Do you want to register another student: \n1 -> Register\n2 -> Back");
            int choice = input.nextInt();
            if (choice != 1){
                continueloop = false;
            }
        }

    }
    public static void addCourses(){
        System.out.println("How many subjects are you creating");
        int userInput = input.nextInt();
        int count = 0;
        while (count != userInput){
            System.out.println("Enter subject name");
            input.nextLine();
            String  subjectName = input.nextLine();

            Courses course = new Courses(subjectName);
            school.addCourse(course);
            count++;
        }
    }
    public static void viewAllStudent(){
        ArrayList<Students>students = school.getAllStudents();
        for (Students student: students)
            System.out.println(student);
    }
    public static void expelStudent(){
        System.out.println("Enter the ID of the student");
        int id = input.nextInt();
        school.expelStudent(id);
    }

}
