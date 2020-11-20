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

// Public method of type class named ModuleTest.
public class ModuleTest

{

    // Declares a private Module named testModule.
    private Modules testModule;
    // Declares a private String named testName and sets it equal to Software Engineering III.
    private String testName = "Software Engineering III";
    // Declares a private integer named testId and sets it equal to a randomly generated six digit integer using ThreadLocalRandom.
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);

    // Declares a private Course named testCourse.
    private Course testCourse;

    // Declares a private Students named testStudent.
    private Students testStudent;

    // @Before used by junit.
    @Before
    // Public method of type void named setUp which is always run before any junit tests.
    public void setUp ()

    {

        // testModule is set equal to a new Module with testName, testID, testStudent, and testCourse as it's parameters.
        testModule = new Modules (testName, testID);
        // Calls the setter method for testModule's student list with testStudent as it's parameter.
        testModule.setStudentList (testStudent);
        // Calls the setter method for testModule's course list with testCourse as it's parameter.
        testModule.setCourseList (testCourse);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named moduleNameTest.
    public void moduleNameTest ()

    {

        // assertEquals is a junit method which will compare the return value of testCourse.getModuleName with testName to see it they match.
        assertEquals (testModule.getModuleName (), testName);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named moduleIDTest.
    public void moduleIDTest ()

    {

        // assertNotNull is a junit method which will check to see if the String value of testModule.getModuleID is not null and see it it equals testID.
        assertNotNull (String.valueOf (testModule.getModuleID ()), testID);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named moduleStudentTest.
    public void moduleStudentTest ()

    {

        // assertTrue is a junit method which will check to see if testStudent is within the ArrayList of type Students returned by testModule.getStudentList.
        assertTrue (testModule.getStudentList ().contains (testStudent));

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named moduleCourseTest.
    public void moduleCourseTest ()

    {

        // assertTrue is a junit method which will check to see if testCourse is within the ArrayList of type Course returned by testModule.getCourseList.
        assertTrue (testModule.getCourseList ().contains (testCourse));

    }

}