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

    private Modules testModule;
    private String testName = "Software Engineering III";
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    private String testStudent = "Craig Walsh";
    private String testCourse = "Computer Science & Information Technology";

    @Before
    public void setUp ()

    {

        testModule = new Modules (testName, testID, testStudent, testCourse);

    }

    @Test
    public void moduleNameTest ()

    {

        assertEquals (testModule.getModuleName(), testName);

    }

    @Test
    public void moduleIDTest ()

    {

        assertNotNull (String.valueOf (testModule.getModuleID ()), testID);

    }

    @Test
    public void moduleStudentTest ()

    {

        assertTrue (testModule.getStudentList ().contains (testStudent));

    }

    @Test
    public void moduleCourseTest ()

    {

        assertTrue (testModule.getCourseList ().contains (testCourse));

    }

}