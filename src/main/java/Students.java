import org.joda.time.DateTime;
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

    public Students (String name, int age, DateTime DOB, int id, ArrayList <String> courses, ArrayList <String> modules)

    {

        setStudentName (name);
        setStudentAge (age);
        setStudentDOB (DOB);
        setStudentID (id);
        setStudentUsername (name, age);
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

        return studentUsername;

    }

    public void setStudentUsername (String name, int age)

    {

        this.studentUsername = name.concat (String.valueOf (age));

    }

    public ArrayList <String> getStudentCourses ()

    {

        return studentCourses;

    }

    public void setStudentCourses (ArrayList <String> studentCourses)

    {

        this.studentCourses = studentCourses;

    }

    public ArrayList <String> getStudentModules ()

    {

        return studentModules;

    }

    public void setStudentModules (ArrayList <String> studentModules)

    {

        this.studentModules = studentModules;

    }

}