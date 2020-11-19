// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the java util ArrayList library.
import java.util.ArrayList;

public class Students

{

    String studentName;
    int studentAge;
    DateTime studentDOB;
    int studentID;
    String studentUsername;
    ArrayList <String> studentCourses = new ArrayList <String> (1);
    ArrayList <String> studentModules = new ArrayList <String> (10);

    public Students (String name, int age, DateTime DOB, int id, String courses, String modules)

    {

        setStudentName (name);
        setStudentAge (age);
        setStudentDOB (DOB);
        setStudentID (id);
        setStudentCourses (courses);
        setStudentModules (modules);

    }

    public String getStudentName ()

    {

        return studentName;

    }

    public void setStudentName (String studentName)

    {

        this.studentName = studentName;

    }

    public int getStudentAge ()

    {

        return studentAge;

    }

    public void setStudentAge (int studentAge)

    {

        this.studentAge = studentAge;

    }

    public DateTime getStudentDOB ()

    {

        return studentDOB;

    }

    public void setStudentDOB (DateTime studentDOB)

    {

        this.studentDOB = studentDOB;

    }

    public int getStudentID ()

    {

        return studentID;

    }

    public void setStudentID (int studentID)

    {

        this.studentID = studentID;

    }

    public String getStudentUsername ()

    {

        this.studentUsername = getStudentName().concat (String.valueOf (getStudentAge ()));

        return studentUsername;

    }

    public ArrayList <String> getStudentCourses ()

    {

        return studentCourses;

    }

    public void setStudentCourses (String studentCourses)

    {

        this.studentCourses.add (studentCourses);

    }

    public ArrayList <String> getStudentModules ()

    {

        return studentModules;

    }

    public void setStudentModules (String studentModules)

    {

        this.studentModules.add (studentModules);

    }

}