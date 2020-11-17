import org.joda.time.DateTime;
import java.util.ArrayList;

public class Students

{

    // Declares a String named studentname.
    String studentName;
    // Declares an integer named studentAge.
    int studentAge;
    // Declares a DateTime named studentDOB.
    DateTime studentDOB;
    // Declares an integer named studentID.
    int studentID;
    // Declares a String named studentUsername.
    String studentUsername;
    // Declares an ArrayList of type String named studentCourses and sets it's initial capacity to 1.
    ArrayList <String> studentCourses = new ArrayList <String> (1);
    // Declares an ArrayList of type String named studentModules and sets it's initial capacity to 10.
    ArrayList <String> studentModules = new ArrayList <String> (10);

    // Constructor Method of Students with parameters of :
    // String named name;
    // Integer named age;
    // DateTime named DOB;
    // Integer named id;
    // ArrayList of type String named courses;
    // ArrayList of type String named modules.
    public Students (String name, int age, DateTime DOB, int id, ArrayList <String> courses, ArrayList <String> modules)

    {

        // Calls the setter method named setStudentName and passes name as it's parameter.
        setStudentName (name);
        // Calls the setter method named setStudentAge and passes name as it's parameter.
        setStudentAge (age);
        // Calls the setter method named setStudentDOB and passes DOB as it's parameter.
        setStudentDOB (DOB);
        // Calls the setter method named setStudentID and passes id as it's parameter.
        setStudentID (id);
        // setStudentUsername (name, age);
        // Calls the setter method named setStudentCourses and passes courses as it's parameter.
        setStudentCourses (courses);
        // Calls the setter method named setStudentModules and passes modules as it's parameter.
        setStudentModules (modules);

    }

    // Method of type String named getStudentName.
    public String getStudentName ()

    {

        // Returns studentName when called.
        return studentName;

    }

    // Method of type void named setStudentName with a String named studentName as it's parameter.
    public void setStudentName (String studentName)

    {

        // studentName is set equal to studentName.
        this.studentName = studentName;

    }

    // Method of type integer named getStudentAge.
    public int getStudentAge ()

    {

        // Returns studentAge when called.
        return studentAge;

    }

    // Method of type void named setStudentAge with an integer named studentAge as it's parameter.
    public void setStudentAge (int studentAge)

    {

        // studentAge is set equal to studentAge.
        this.studentAge = studentAge;

    }

    // Method of type DateTime named getStudentDOB.
    public DateTime getStudentDOB ()

    {

        // Returns studentDOB when called.
        return studentDOB;

    }

    // Method of type void named setStudentDOB with a DateTime named studentDOB as it's parameter.
    public void setStudentDOB (DateTime studentDOB)

    {

        // studentDOB is set equal to studentDOB.
        this.studentDOB = studentDOB;

    }

    // Method of type integer named getStudentID.
    public int getStudentID ()

    {

        // Returns studentID when called.
        return studentID;

    }

    // Method of type void named setStudentID with an integer named studentID as it's parameter.
    public void setStudentID (int studentID)

    {

        // studentID is set equal to studentID.
        this.studentID = studentID;

    }

    // Method of type String named getStudentUsername.
    public String getStudentUsername ()

    {

        // System.out.println(getStudentName());
        // System.out.println(getStudentAge());

        // studentUsername is set equal to the concatenated values of studentName and the String value of studentAge.
        this.studentUsername = getStudentName().concat (String.valueOf (getStudentAge ()));

        // Returns studentUsername when called.
        return studentUsername;

    }

//    public void setStudentUsername (String name, int age)
//
//    {
//
//        this.studentUsername = name.concat (String.valueOf (age));
//
//    }

    // Method of type ArrayList of type String named getStudentCourses.
    public ArrayList <String> getStudentCourses ()

    {

        // Return studentCourses when called.
        return studentCourses;

    }

    // Method of type void named setStudentCourses with an ArrayList of type String named studentCourses as it's parameter.
    public void setStudentCourses (ArrayList <String> studentCourses)

    {

        // studentCourses is set equal to studentCourses.
        this.studentCourses = studentCourses;

    }

    // Method of type ArrayList of type String named getStudentModules.
    public ArrayList <String> getStudentModules ()

    {

        // Returns studentModules when called.
        return studentModules;

    }

    // Method of type void named setStudentModules with an ArrayList of type String named studentModules as it's parameter.
    public void setStudentModules (ArrayList <String> studentModules)

    {

        // studentModules is set equal to studentModules.
        this.studentModules = studentModules;

    }

}