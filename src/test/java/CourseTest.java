// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the junit Before library.
import org.junit.Before;
// Imports the junit Test library.
import org.junit.Test;
// Imports the junit assertEquals library.
import static org.junit.Assert.assertEquals;
// Imports the junit assertTrue library.
import static org.junit.Assert.assertTrue;

// Public method of type class named CourseTest.
public class CourseTest

{

    // Declares a private Course named testCourse.
    private Course testCourse;
    // Declares a private String named testName and sets it equal to Computer Science & Information Technology.
    private String testName = "Test Course 1";
    // Declares a private DateTime named testStartDate and set it equal to (2022, 6, 2, 2, 24).
    private DateTime testStartDate = new DateTime (2022, 6, 2, 2, 24);
    // Declares a private DateTime named testEndDate and sets it equal to (2026, 11, 3, 11, 51).
    private DateTime testEndDate = new DateTime (2026, 11, 3, 11, 51);

    // Declares a private Modules named testModule.
    private Modules testModule;

    // Declares a private Students named testStudent.
    private Students testStudent;

    // @Before used by junit.
    @Before
    // Public method of type void named setUp which is always run before any junit tests.
    public void setUp ()

    {

        // testCourse is set equal to a new Course with testName, testStartDate, and testEndDate as it's parameters.
        testCourse = new Course (testName, testStartDate, testEndDate);
        // Calls the setter method for testCourse's module list with testModule as it's parameter.
        testCourse.setModuleList (testModule);
        // Calls the setter method for testCourse's student list with testStudent as it's parameter.
        testCourse.setStudentList (testStudent);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named courseNameTest.
    public void courseNameTest ()

    {

        // assertEquals is a junit method which will compare the return value of testCourse.getCourseName with testName to see it they match.
        assertEquals (testCourse.getCourseName (), testName);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named courseModuleTest.
    public void courseModuleTest ()

    {

        // assertTrue is a junit method which will check to see if testModule is within the ArrayList of type Modules returned by testCourse.getModuleList.
        assertTrue (testCourse.getModuleList ().contains (testModule));

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named courseStudentTest.
    public void courseStudentTest ()

    {

        // assertTrue is a junit method which will check to see if testStudent is within the ArrayList of type String returned by testCourse.getStudentList.
        assertTrue (testCourse.getStudentList ().contains (testStudent));

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named startDateTest.
    public void startDateTest ()

    {

        // assertEquals is a junit method which will compare the return value of testCourse.getStartDate with testStartDate to see it they match.
        assertEquals (testCourse.getStartDate (), testStartDate);

    }

    // @Test test to run for junit.
    @Test
    // Public method of type void named endDateTest.
    public void startEndTest ()

    {

        // assertEquals is a junit method which will compare the return value of testCourse.getEndDate with testEndDate to see it they match.
        assertEquals (testCourse.getEndDate (), testEndDate);

    }

}