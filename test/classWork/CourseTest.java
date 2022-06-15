package classWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {
    Courses courses;
    Courses courses1;
    Courses courses2;
//    Courses courses2;
    @BeforeEach
    void setup(){
        courses = new Courses("maths");
        courses.resetId();
//        courses2 = new Courses("english");
    }

    @Test
    void testThatCourseWasCreated(){
        assertEquals("maths", courses.getCourseName());
        courses1 = new Courses("english");
        System.out.println(courses.getId());
        assertEquals(1, courses1.getId());
        courses2 = new Courses("biology");
        assertEquals(2, courses2.getId());

    }




}
