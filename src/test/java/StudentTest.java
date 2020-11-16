import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest

{

    private Students testStudent;
    private String testName;
    private int testAge;
    private DateTime testDOB = new DateTime (2030, 7, 7, 13, 49);
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    private String testUsername;
    private ArrayList <String> testCourses = new ArrayList <String> (1);
    private ArrayList <String> testModules = new ArrayList <String> (10);

    @Before
    public void setup ()

    {

        testStudent = new Students (testName, testAge, testDOB, testID, testCourses, testModules);

    }

    @Test
    public void studentNameTest ()

    {

        assertEquals (testStudent.getStudentName (), testName);

    }

    @Test
    public void studentAgeTest ()

    {

        assertNotNull (String.valueOf (testStudent.getStudentAge ()), testAge);

    }

    @Test
    public void studentDOBTest ()

    {

        assertEquals (testStudent.getStudentDOB (), testDOB);

    }

    @Test
    public void studentIDTest ()

    {

        assertNotNull (String.valueOf (testStudent.getStudentID ()), testID);

    }

    @Test
    public void studentUsernameTest ()

    {

        assertEquals (testStudent.getStudentUsername (), testUsername);

    }

    @Test
    public void studentCoursesTest ()

    {

        assertEquals (testStudent.getStudentCourses (), testCourses);

    }

    @Test
    public void studentModulesTest ()

    {

        assertEquals (testStudent.getStudentModules (), testModules);

    }

}