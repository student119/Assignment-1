import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseTest

{

    // Declares a new private Course object named testCourse.
    private Course testCourse;
    // Declares a new private String named testName and sets it equal to "Computer Science & Information Technology".
    private String testName = "Computer Science & Information Technology";
    // Declares a new private ArrayList of type String named testModule and sets it's initial capacity to 10.
    private ArrayList <String> testModules = new ArrayList <String> (10);
//    testModules.add("CT561 Systems Modelling & Simulation");
//    testModules.add("CT436 Advanced Professional Skills");
//    testModules.add("CT4100 Information Retrieval");
//    testModules.add("CT417 Software Engineering III");
//    testModules.add("CT4101 Machine Learning");
//    testModules.add("CT437 Computer Security & Forensic Computing");
//    testModules.add("CS402 Cryptography");
//    testModules.add("CT421 Artificial Intelligence");
//    testModules.add("CT420 Real Time Systems");
//    testModules.add("CT414 Distributed Systems & Co-Operative Computing");
    // Declares a private ArrayList named testStudent of type String and sets it;s initial capacity to 100.
    private ArrayList <String> testStudents = new ArrayList <String> (100);
//    testStudents.add("Craig Walsh");
//    testStudents.add("Nathan Ryder");
//    testStudents.add("David Clifford");
//    testStudents.add("Matthias Nickles");
//    testStudents.add("Alan Turing");
//    testStudents.add("Isaac Asimov");
//    testStudents.add("Christopher Nolan");
//    testStudents.add("Orlando Bloom");
//    testStudents.add("Jaroslaw Janas");
//    testStudents.add("David Schwimmer");
    // Declares a private DateTime named testStartDate and sets it equal to (2022, 6, 2, 2, 24).
    private DateTime testStartDate = new DateTime (2022, 6, 2, 2, 24);
    // Declares a private DateTime named testEndDate and sets it equal to (2026, 11, 3. 11, 51).
    private DateTime testEndDate = new DateTime (2026, 11, 3, 11, 51);

    // @Before runs before any of the @Test tests set up for junit.
    @Before
    // Method of type void named setup to assign variables to testCourse.
    public void setup ()

    {

        // testCourse has testName, testModules, testStudents, testStartDate, and testEndDate passed as it's parameters.
        testCourse = new Course (testName, testModules, testStudents, testStartDate, testEndDate);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named courseNameTest which will test if the course name has been correctly assigned.
    public void courseNameTest ()

    {

        // assertEquals is a method from junit which compares the result from the testCourse getCourseName getter method from Course
        // and sees if it matches the value in testName.
        assertEquals (testCourse.getCourseName (), testName);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named courseModuleTest which will test if the modules for a course have been correctly assigned.
    public void courseModuleTest ()

    {

        // assertEquals is a method from junit which compares the result from the testCourse getModuleList method from Course
        // and sees it it matches the values in testModules.
        assertEquals (testCourse.getModuleList (), testModules);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named courseStudentTest which will test if the students for a course have been correctly assigned.
    public void courseStudentTest ()

    {

        // assertEquals is a method from junit which compares the result from the testCourse getStudentList method from Course
        // and sees it it matches the values in testStudents.
        assertEquals (testCourse.getStudentList (), testStudents);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void named startDateTest which will test if a start date for a course has been correctly assigned.
    public void startDateTest ()

    {

        // assertEquals is a method from junit which compares the result from the testCourse getStartDate getter method from Course
        // and sees if it matches the value in testStartDate.
        assertEquals (testCourse.getStartDate (), testStartDate);

    }

    // @Test test to run for junit.
    @Test
    // Method of type void names startEndTest which will test if an end date for a course has been correctly assigned.
    public void startEndTest ()

    {

        // assertEquals is a method from junit which compares the result from the testCourse getEndDate method from Course
        // and sees if it matches the value in testEndDate.
        assertEquals (testCourse.getEndDate (), testEndDate);

    }

}