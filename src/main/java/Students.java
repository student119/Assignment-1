import org.joda.time.DateTime;

public class Students

{

    String studentName;
    int studentAge;
    DateTime studentDOB;
    int studentID;
    String studentUsername;
    String[] studentCourses;
    String[] studentModules;

    public Students ()

    {

        //

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

    public String getStudentUsername (String sName, int sAge)

    {

        sName = studentName;
        sAge = studentAge;

        studentUsername = sName.concat(String.valueOf(studentAge));

        return studentUsername;

    }

    public void setStudentUsername (String studentUsername)

    {

        this.studentUsername = studentUsername;

    }

    public String[] getStudentCourses ()

    {

        return studentCourses;

    }

    public void setStudentCourses (String[] studentCourses)

    {

        this.studentCourses = studentCourses;

    }

    public String[] getStudentModules ()

    {

        return studentModules;

    }

    public void setStudentModules (String[] studentModules)

    {

        this.studentModules = studentModules;

    }

}