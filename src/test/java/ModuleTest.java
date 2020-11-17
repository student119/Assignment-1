import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModuleTest

{

    // Declares a private Module object named testModule.
    private Modules testModule;
    // Declares a private String named testName and sets it equal to "Software Engineering III".
    private String testName = "Software Engineering III";
    // Declares a private int named testID and sets it equal to a random six digit integer.
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    // Declares a private ArrayList of type String named testStudent and sets it's initial capacity to 100.
    private ArrayList <String> testStudent = new ArrayList <String> (100);
    // Declares a private ArrayList of type String named testCourses and sets it's initial capacity to 1.
    private ArrayList <String> testCourses = new ArrayList <String> (1);

    // @Before runs before any of the @Test tests set up for junit.
    @Before
    // Method of type void named setUp to assign variables to testModule.
    public void setUp ()

    {

        // testModule has testName, testID, testStudent, and testCourses passed as it's parameters.
        testModule = new Modules (testName, testID, testStudent, testCourses);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named moduleNameTest which will test if the name for a module has been correctly assigned.
    public void moduleNameTest ()

    {

        // assertEquals is a method from junit which compares the result from the testModule getModuleName getter method from Modules
        // and sees if it matches the value in testName.
        assertEquals (testModule.getModuleName(), testName);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named moduleIDTest which will test if the id for a module has been correctly assigned.
    public void moduleIDTest ()

    {

        // assertNotNull is a method from junit which compares the result from the testModule getModuleID getter method from Modules
        // and sees if it matches the value in testID.
        assertNotNull (String.valueOf (testModule.getModuleID ()), testID);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named moduleStudentTest which will test if a student for a module has been assigned correctly.
    public void moduleStudentTest ()

    {

        // assertEquals is a method from junit which compares the results from the testModule getStudentList getter method from Modules
        // and sees if it matches the value in testStudent.
        assertEquals (testModule.getStudentList (), testStudent);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named moduleCourseTest which will test if a module has been correctly assigned to a course.
    public void moduleCourseTest ()

    {

        // assertEquals is a method from junit which compares the results from the testCourseList getter method from Modules
        // and sees if it matches the value in testCourse.
        assertEquals (testModule.getCourseList (), testCourses);

    }

}