import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModuleTest

{

    private Modules testModule;
    private String testName = "Software Engineering III";
    private int testID = ThreadLocalRandom.current ().nextInt (1, 999999 + 1);
    private ArrayList <String> testStudent = new ArrayList <String> (100);
    private ArrayList <String> testCourse = new ArrayList <String> (1);

    @Before
    public void setup ()

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

        assertEquals (testModule.getStudentList (), testStudent);

    }

    @Test
    public void moduleCourseTest ()

    {

        assertEquals (testModule.getCourseList (), testCourse);

    }

}