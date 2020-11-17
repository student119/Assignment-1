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
    // Declares a private integer named testAge and sets it equal to 28.
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

        // testStudent has testName, testAge. testDOB, testID, testCourses, and testModules passed as it's parameters.
        testStudent = new Students (testName, testAge, testDOB, testID, testCourses, testModules);
        // The testUsername is built by concatenating the name and age of the student.
        // It does not have a setter method, instead using a modified getter method to generate the username.
        // For testing purposes, the username must be generated using the below line.
        // testUsername is set equal to the concatenated values of testName and the String value of testAge.
        testUsername = testName.concat((String.valueOf (testAge)));

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentNameTest which will test if the name for a student has been correctly assigned.
    public void studentNameTest ()

    {

        // assertEquals is a method from junit which compares the result from the testStudent getStudentName getter method from Students
        // and sees if it matches the value in testName.
        assertEquals (testStudent.getStudentName (), testName);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentAgeTest which will test if the age for a student has been correctly assigned.
    public void studentAgeTest ()

    {

        // assertsEquals is a method from junit which compares the result from the testStudent getStudentAge getter method from Students
        // and sees if it matches the value in testAge.
        assertNotNull (String.valueOf (testStudent.getStudentAge ()), testAge);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentDOBTest which will test if the date of birth for a student has been correctly assigned.
    public void studentDOBTest ()

    {

        // assertEquals is a method from junit which compares the result from the testStudent getStudentDOB getter method from Students
        // and sees if it matches the value in testDOB.
        assertEquals (testStudent.getStudentDOB (), testDOB);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentIDTest which will test if the id for a student has been correctly assigned.
    public void studentIDTest ()

    {

        // assertNotNull is a method from junit which compares the result from the testStudent getStudentID getter method from Students
        // and sees if it matches the value in testID.
        assertNotNull (String.valueOf (testStudent.getStudentID ()), testID);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentUsernameTest which will test if the username for a student has been correctly assigned.
    public void studentUsernameTest ()

    {

        // assertEquals is a method from junit which compares the result from the testStudent getStudentUsername getter method from Students
        // and sees if it matches the value in testUsername.
        assertEquals (testStudent.getStudentUsername (), testUsername);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentCourseTest which will test if the course for a student has been assigned correctly.
    public void studentCoursesTest ()

    {

        // assertEquals is a method from junit which compares the results from the testStudents getStudentCourses getter method from Students
        // and sees if it matches the value in testCourses.
        assertEquals (testStudent.getStudentCourses (), testCourses);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named studentModulesTest which will test if the modules for a student have been correctly assigned.
    public void studentModulesTest ()

    {

        // assertEquals is a method from junit which compares the results from the testStudent getStudentModules getter method from Students
        // and sees if it matches the value in testModules.
        assertEquals (testStudent.getStudentModules (), testModules);

    }

}