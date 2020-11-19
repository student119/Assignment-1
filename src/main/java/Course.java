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

    // Public constructor method of Course with parameters of :
    // String named course;
    // String named module;
    // String named student;
    // DateTime named start;
    // DateTime named end.
    public Course (String course, String module, String student, DateTime start, DateTime end)

    {

        // Calls the setter method named setCourseName with course as it's parameter.
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

    // Public method of type ArrayList of type String named getModuleList.
    public ArrayList <String> getModuleList ()

    {

        // Returns moduleList when called.
        return moduleList;

    }

    // Public method of type void named setModuleList with a String named moduleList as it's parameter.
    public void setModuleList (String moduleList)

    {

        // moduleList is added to moduleList.
        this.moduleList.add (moduleList);

    }

    // Public method of type ArrayList of type String named getStudentList.
    public ArrayList <String> getStudentList ()

    {

        // Returns studentList when called.
        return studentList;

    }

    // Public method of type void named setStudentList with a String named studentList as it's parameter.
    public void setStudentList (String studentList)

    {

        // studentList is added to studentList.
        this.studentList.add (studentList);

    }

    // Public method of type DateTime named getStartDate.
    public DateTime getStartDate ()

    {

        // Returns startDate when called.
        return startDate;

    }

    // Public method of type void named setStartDate with a DateTime named startDate as it's parameter.
    public void setStartDate (DateTime startDate)

    {

        // startDate is set equal to startDate.
        this.startDate = startDate;

    }

    // Public method of type DateTime name getEndDate.
    public DateTime getEndDate ()

    {

        // Returns endDate when called.
        return endDate;

    }

    // Public method of type void named setEndDate with a DateTime named endDate as it's parameter.
    public void setEndDate (DateTime endDate)

    {

        // endDate is set equal to endDate.
        this.endDate = endDate;

    }

}