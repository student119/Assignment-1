// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the java util ArrayList library.
import java.util.ArrayList;

// Public method of type class named Course.
public class Course

{

    // Declares a String named courseName.
    String courseName;
    // Declares an ArrayList of type String named moduleList and sets it's initial capacity to 10.
    ArrayList <String> moduleList = new ArrayList <String> (10);
    // Declares an ArrayList of type String named studentList and sets it's initial capacity to 100.
    ArrayList <String> studentList = new ArrayList <String> (100);
    // Declares a DateTime named startDate.
    DateTime startDate;
    // Declares a DateTime of endDate.
    DateTime endDate;

    // Public method of type Course with parameters of :
    // String named course;
    // String named module;
    // String named student;
    // DateTime named start;
    // DateTime named end.
    public Course (String course, String module, String student, DateTime start, DateTime end)

    {

        // Calls the setter method named setCourseName with course as it parameter.
        setCourseName (course);
        // Calls the setter method named setModuleList with module as it's parameter.
        setModuleList (module);
        // Calls the setter method named setStudentList with student as it's parameter.
        setStudentList (student);
        // Calls the setter method named setStartDate with start as it's parameter.
        setStartDate (start);
        // Calls the setter method named setEndDate with end as it's parameter.
        setEndDate (end);

    }

    // Public method of type String named getCourseName.
    public String getCourseName ()

    {

        // Returns courseName when called.
        return courseName;

    }

    // Public method of type void named setCourseName with a String named courseName as it's parameter.
    public void setCourseName (String courseName)

    {

        // courseName is set equal to courseName
        this.courseName = courseName;

    }

    public ArrayList <String> getModuleList ()

    {

        return moduleList;

    }

    public void setModuleList (String moduleList)

    {

        this.moduleList.add (moduleList);

    }

    public ArrayList <String> getStudentList ()

    {

        return studentList;

    }

    public void setStudentList (String studentList)

    {

        this.studentList.add (studentList);

    }

    public DateTime getStartDate ()

    {

        return startDate;

    }

    public void setStartDate (DateTime startDate)

    {

        this.startDate = startDate;

    }

    public DateTime getEndDate ()

    {

        return endDate;

    }

    public void setEndDate (DateTime endDate)

    {

        this.endDate = endDate;

    }

}