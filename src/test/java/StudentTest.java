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

// Public method of type class StudentTest.
public class StudentTest

{

    // Declares a private Student named testStudent.
    private Students testStudent;
    // Declares a private String named testName and sets it equal to Craig Walsh.
    private String testName = "Craig Walsh";
    // Declares a private int named testAge and sets it equal to 28.
    private int testAge = 28;
    // Declares a private DateTime named testDOB and sets it equal to (1992, 1, 7, 13, 49).
    private DateTime testDOB = new DateTime (1992, 1, 7, 13, 49);
    // Declares a private integer named testID and sets it equal to a randomly generated six digit integer using ThreadLocalRandom.
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    // Declares a private String named testUsername.
    private String testUsername;
    // Declares a private String named testCourse and sets it equal to Computer Science & Information Technology.
    private String testCourse = "Computer Science & Information Technology";
    // Declares a private String named testModule and sets it equal to Software Engineering III.
    private String testModule = "Software Engineering III";

    // @Before used by junit.
    @Before
    // Public method of type void named setUp which is always run before any junit tests.
    public void setUp ()

    {

        // testStudent is set equal to a new Student with testName, testAge, testDOB, testID, testCourse, and testModule as it's parameters.
        testStudent = new Students (testName, testAge, testDOB, testID, testCourse, testModule);
        // The testUsername is built by concatenating the name and age of the student.
        // It does not have a setter method, instead using a modified getter method to generate the username.
        // For testing purposes, the username must be generated using the below line.
        // testUsername is set equal to the concatenated values of testName and the String value of testAge.
        testUsername = testName.concat((String.valueOf (testAge)));

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named studentNameTest.
    public void studentNameTest ()

    {

        // assertEquals is a junit method which will compare the return value of testStudent.getStudentName with testName to see it they match.
        assertEquals (testStudent.getStudentName (), testName);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named studentAgeTest.
    public void studentAgeTest ()

    {

        // assertNotNull is a junit method which will check to see if the String value of testStudent.getStudentAge is not null and see it it equals testAge.
        assertNotNull (String.valueOf (testStudent.getStudentAge ()), testAge);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named
    public void studentDOBTest ()

    {

        // assertEquals is a junit method which will compare the return value of testStudent.getStudentName with testName to see it they match.
        assertEquals (testStudent.getStudentDOB (), testDOB);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named
    public void studentIDTest ()

    {

        // assertNotNull is a junit method which will check to see if the String value of testStudent.getStudentID is not null and see it it equals testID.
        assertNotNull (String.valueOf (testStudent.getStudentID ()), testID);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named
    public void studentUsernameTest ()

    {

        // assertEquals is a junit method which will compare the return value of testStudent.getStudentUsername with testUsername to see it they match.
        assertEquals (testStudent.getStudentUsername (), testUsername);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named
    public void studentCoursesTest ()

    {

        // assertTrue is a junit method which will check to see if testCourse is within the ArrayList of type String returned by testStudent.getStudentCourses.
        assertTrue (testStudent.getStudentCourses ().contains (testCourse));

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named
    public void studentModulesTest ()

    {

        // assertTrue is a junit method which will check to see if testModule is within the ArrayList of type String returned by testStudent.getStudentModules.
        assertTrue (testStudent.getStudentModules ().contains (testModule));

    }

}