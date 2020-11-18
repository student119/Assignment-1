// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the junit Before library.
import org.junit.Before;
// Imports the junit Test library.
import org.junit.Test;
// Imports the concurrent ThreadLocalRandom library.
import java.util.concurrent.ThreadLocalRandom;
// Imports the junit assertEquals library.
import static org.junit.Assert.assertEquals;
// Imports the junit assertNotNull library.
import static org.junit.Assert.assertNotNull;
// Imports the junit assertTrue library.
import static org.junit.Assert.assertTrue;

public class StudentTest

{

    private Students testStudent;
    private String testName = "Craig Walsh";
    private int testAge = 28;
    private DateTime testDOB = new DateTime (1992, 1, 7, 13, 49);
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    private String testUsername;
    private String testCourse = "Computer Science & Information Technology";
    private String testModule = "Software Engineering III";

    @Before
    public void setUp ()

    {

        testStudent = new Students (testName, testAge, testDOB, testID, testCourse, testModule);
        // The testUsername is built by concatenating the name and age of the student.
        // It does not have a setter method, instead using a modified getter method to generate the username.
        // For testing purposes, the username must be generated using the below line.
        // testUsername is set equal to the concatenated values of testName and the String value of testAge.
        testUsername = testName.concat((String.valueOf (testAge)));

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

        assertTrue (testStudent.getStudentCourses ().contains (testCourse));

    }

    @Test
    public void studentModulesTest ()

    {

        assertTrue (testStudent.getStudentModules ().contains (testModule));

    }

}