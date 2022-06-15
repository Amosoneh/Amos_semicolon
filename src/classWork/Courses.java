package classWork;

public class Courses {
    private static int id = 1;
    private final int courseId;
    private String courseName;

 public Courses(String courseName){
     this.courseName = courseName;
     courseId = id++;
 }

    public String getCourseName() {
     return courseName;
    }

    public int getId() {
        return courseId;
    }
    @Override
    public String toString(){
        return ("CourseId "+ getId()+
                "\nCourse Name: " + getCourseName()
        );
    }

    public void resetId() {
        id = 1;
    }
}
