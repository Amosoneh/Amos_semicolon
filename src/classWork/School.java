package classWork;

import java.util.ArrayList;

public class School {
    private String name;
   private String address;

   private ArrayList<Courses> courseList = new ArrayList<>();
   private ArrayList<Students>studentList = new ArrayList<>();
   int listLength = studentList.size();

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void addCourse(Courses course) {
        courseList.add(course);
    }

    public Courses getCourse(String courseName) {
        for (Courses course: courseList){
            if (course.getCourseName().equalsIgnoreCase(courseName)){
                return course;
            }
        }
        throw new IllegalArgumentException("Course with course name "+ courseName+ " not found");
    }

    public void removeCourse(String courseName) {
        Courses courseToBeRemoved = null;
        for (Courses course: courseList){
            if (course.getCourseName().equalsIgnoreCase(courseName)){
                courseToBeRemoved =course;
            }
        }
        if (courseToBeRemoved == null) {
            throw new IllegalArgumentException("Course with course name "+ courseName+ " not found");
        }
        courseList.remove(courseToBeRemoved);


    }

    public ArrayList<Courses> getAllCourses(){
        return courseList;
    }

    public void addStudent(Students newStudent) {
        studentList.add(newStudent);
    }

    public Students getStudent(int studentId) {
        for (Students student: studentList){
            if (student.getStudentId() == studentId){
                return student;
            }
        }
        throw new IllegalArgumentException("Student with id "+ studentId+ " is not found");
    }

    public ArrayList<Students> getAllStudents(){
       return studentList;
    }


    public void expelStudent(int studentId) {
        Students expelledStudent = null;
        for (Students student : studentList){
            if (student.getStudentId() == studentId){
                expelledStudent = student;
                break;
            }
            throw new IllegalArgumentException("Student with id " + studentId + " is not found");
        }
        studentList.remove(expelledStudent);
    }
}
