import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseTest

{

    private Course testCourse;
    private String testName = "Computer Science & Information Technology";
    private ArrayList <String> testModule = new ArrayList <String> (10);
    private ArrayList <String> testStudent = new ArrayList <String> (100);
    private DateTime testStartDate = new DateTime (2022, 6, 2, 0, 0);
    private DateTime testEndDate = new DateTime (2026, 11, 3, 0, 0);

    @Before
    public void setup ()

    {

        testCourse = new Course (testName, testModule, testStudent, testStartDate, testEndDate);

    }

    @Test
    public void courseNameTest ()

    {

        assertEquals (testCourse.getCourseName (), testName);

    }

    @Test
    public void courseModuleTest ()

    {

        assertEquals (testCourse.getModuleList (), testModule);

    }

    @Test
    public void courseStudentTest ()

    {

        assertEquals (testCourse.getStudentList (), testStudent);

    }

    @Test
    public void startDateTest ()

    {

        assertEquals (testCourse.getStartDate (), testStartDate);

    }

    @Test
    public void startEndTest ()

    {

        assertEquals (testCourse.getEndDate (), testEndDate);

    }

}