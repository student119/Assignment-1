import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest

{

    // Declares a private Student object named testStudent.
    private Students testStudent;
    // Declares a private String named testName and sets it equal to "Craig Walsh".
    private String testName = "Craig Walsh";
    // Declares a private int named testAge and sets it equal to 28.
    private int testAge = 28;
    // Declares a private DateTime named testDOB and sets it equal to (1992, 1, 7, 13, 49).
    private DateTime testDOB = new DateTime (1992, 1, 7, 13, 49);
    // Declares a private int named testID and sets it equal to a random six digit integer.
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    // Declares a private String named testUsername.
    private String testUsername;
    // Declares a private ArrayList of type String named testCourses and sets it's initial capacity to 1.
    private ArrayList <String> testCourses = new ArrayList <String> (1);
    // Declares a private ArrayList of type String named testModules and sets it's initial capacity to 10.
    private ArrayList <String> testModules = new ArrayList <String> (10);

    // @Before runs before any of the @Test tests set up for junit.
    @Before
    // Method of type void named setUp to assign variables to testStudent.
    public void setUp ()

    {

        //
        testStudent = new Students (testName, testAge, testDOB, testID, testCourses, testModules);
        // 
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

        assertEquals (testStudent.getStudentCourses (), testCourses);

    }

    @Test
    public void studentModulesTest ()

    {

        assertEquals (testStudent.getStudentModules (), testModules);

    }

}