import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course

{

    String courseName;
    ArrayList <String> moduleList = new ArrayList <String> (10);
    ArrayList <String> studentList = new ArrayList <String> (100);
    DateTime startDate;
    DateTime endDate;

    public Course (String course, String module, String student, DateTime start, DateTime end)

    {

        setCourseName (course);
        setModuleList (module);
        setStudentList (student);
        setStartDate (start);
        setEndDate (end);

    }

    public String getCourseName ()

    {

        return courseName;

    }

    public void setCourseName (String courseName)

    {

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