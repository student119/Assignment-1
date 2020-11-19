// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the java util ArrayList library.
import java.util.ArrayList;

// Public method of type class named Students.
public class Students

{

    // Declares a String named studentName.
    String studentName;
    // Declares an integer named studentAge.
    int studentAge;
    // Declares a DateTime named studentDOB.
    DateTime studentDOB;
    // Declares an integer named studentID.
    int studentID;
    // Declares a String named studentUsername.
    String studentUsername;
    // Declares an ArrayList of type String named studentCourses and sets it's initial capacity to 10.
    ArrayList <String> studentCourses = new ArrayList <String> (10);
    // Declares an ArrayList of type String named studentModules ad sets it's initial capacity to 100.
    ArrayList <String> studentModules = new ArrayList <String> (100);

    // Public constructor method of Students with parameters of :
    // String named name;
    // Integer named age;
    // DateTime named DOB;
    // Integer named ID;
    // String named courses;
    // String named modules.
    public Students (String name, int age, DateTime DOB, int ID, String courses, String modules)

    {

        // Calls the setter method named setStudentName with name as it's parameter.
        setStudentName (name);
        // Calls the setter method named setStudentAge with age as it's parameter.
        setStudentAge (age);
        // Calls the setter method named setStudentDOB with DOB as it's parameter.
        setStudentDOB (DOB);
        // Calls the setter method named setStudentID with ID as it's parameter.
        setStudentID (ID);
        // Calls the setter method named setStudentCourses with courses as it's parameter.
        setStudentCourses (courses);
        // Calls the setter method named setStudentModules with modules as it's parameter.
        setStudentModules (modules);

    }

    // Public method of type String named getStudentName.
    public String getStudentName ()

    {

        // Returns studentName when called.
        return studentName;

    }

    // Public method of type void named setStudentName with a String named studentName as it's parameter.
    public void setStudentName (String studentName)

    {

        // studentName is set equal to studentName.
        this.studentName = studentName;

    }

    // Public method of type integer named getStudentAge.
    public int getStudentAge ()

    {

        // Returns studentAge when called.
        return studentAge;

    }

    // Public method of type void named setStudentAge with an integer named studentAge as it's parameter.
    public void setStudentAge (int studentAge)

    {

        // studentAge is set equal to studentAge.
        this.studentAge = studentAge;

    }

    // Public method of type DateTime named getStudentDOB.
    public DateTime getStudentDOB ()

    {

        // Returns studentDOB when called.
        return studentDOB;

    }

    // Public method of type void named setStudentDOB with a DateTime named studentDOB as it's parameter.
    public void setStudentDOB (DateTime studentDOB)

    {

        // studentDOB is set equal to studentDOB.
        this.studentDOB = studentDOB;

    }

    // Public method of type integer named getStudentID,
    public int getStudentID ()

    {

        // Returns studentID when called.
        return studentID;

    }

    // Public method of type void named setStudentID with an integer named studentID as it's parameter.
    public void setStudentID (int studentID)

    {

        // studentID is set equal to studentID.
        this.studentID = studentID;

    }

    // Public method of type String named getStudentUsername.
    public String getStudentUsername ()

    {

        // studentUsername is set equal to the concatenated values of getStudentName and the String value of getStudentAge.
        this.studentUsername = getStudentName().concat (String.valueOf (getStudentAge ()));

        // Returns studentUsername when called.
        return studentUsername;

    }

    // Public method of type ArrayList of type String named getStudentCourses.
    public ArrayList <String> getStudentCourses ()

    {

        // Returns studentCourses when called.
        return studentCourses;

    }

    // Public method of type void named setStudentCourses with a String named studentCourses as it's parameter.
    public void setStudentCourses (String studentCourses)

    {

        // studentCourses is added to studentCourses.
        this.studentCourses.add (studentCourses);

    }

    // Public method of type ArrayList of type String named getStudentModules.
    public ArrayList <String> getStudentModules ()

    {

        // Returns studentModules when called.
        return studentModules;

    }

    // Public method of type void named setStudentModules with a String named studentModules as it's parameter.
    public void setStudentModules (String studentModules)

    {

        // studentModules is added to studentModules.
        this.studentModules.add (studentModules);

    }

}