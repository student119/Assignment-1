import org.joda.time.DateTime;
import java.util.ArrayList;

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
    // Declares a DateTime named endDate.
    DateTime endDate;

    // Constructor Method of Course with parameters of :
    // String named course;
    // Arraylist of type String named module;
    // ArrayList of type String named student;
    // DateTime named start;
    // DateTime named end.
    public Course (String course, ArrayList <String> module, ArrayList <String> student, DateTime start, DateTime end)

    {

        // Calls the setter method named setCourseName and passes course as it's parameter.
        setCourseName (course);
        // Calls the setter method named setModuleLists and passes module as it's parameter.
        setModuleList (module);
        // Calls the setter method named setStudentList and passes student as it's parameter.
        setStudentList (student);
        // Calls the setter method named setStartDate and passes start as it's parameter.
        setStartDate (start);
        // Calls the setter method named seTEndDate and passes end as it's parameter.
        setEndDate (end);

    }

    // Method of type String named getCourseName.
    public String getCourseName ()

    {

        // Returns courseName when called.
        return courseName;

    }

    // Method of type void named setCourseName with a String named courseName as it's parameter.
    public void setCourseName (String courseName)

    {

        // courseName is set equal to courseName.
        this.courseName = courseName;

    }

    // Method of type ArrayList of type String named getModuleList.
    public ArrayList <String> getModuleList ()

    {

        // Returns moduleList when called.
        return moduleList;

    }

    // Method of type void named setModuleList with an ArrayList of type String named moduleList as it's parameter.
    public void setModuleList (ArrayList <String> moduleList)

    {

        // moduleList is set equal to moduleList.
        this.moduleList = moduleList;

    }

    // Method of type ArrayList of type String named getStudentList.
    public ArrayList <String> getStudentList ()

    {

        // Returns studentList when called.
        return studentList;

    }

    // Method of type void named setStudentList with an ArrayList of type String named studentList as it's parameter.
    public void setStudentList (ArrayList <String> studentList)

    {

        // studentList is set equal to studentList.
        this.studentList = studentList;

    }

    // Method of type DateTime named getStartDate.
    public DateTime getStartDate ()

    {

        // Returns startDate when called.
        return startDate;

    }

    // Method of type void named setStartDate with a DateTime named startDate as it's parameter.
    public void setStartDate (DateTime startDate)

    {

        // startDate is set equal to startDate.
        this.startDate = startDate;

    }

    // Method of type DateTime named getEndDate.
    public DateTime getEndDate ()

    {

        // Returns endDate when called.
        return endDate;

    }

    // Method of type void named setEndDate with a DateTime named endDate as it's parameter.
    public void setEndDate (DateTime endDate)

    {

        // endDate is set equal to endDate.
        this.endDate = endDate;

    }

}