import org.joda.time.DateTime;

public class Course

{

    String courseName;
    String[] moduleList;
    String[] studentList;
    DateTime startDate;
    DateTime endDate;

    public Course ()

    {

        //

    }

    public String getCourseName ()

    {

        return courseName;

    }

    public void setCourseName (String courseName)

    {

        this.courseName = courseName;

    }

    public String[] getModuleList ()

    {

        return moduleList;

    }

    public void setModuleList (String[] moduleList)

    {

        this.moduleList = moduleList;

    }

    public String[] getStudentList ()

    {

        return studentList;

    }

    public void setStudentList (String[] studentList)

    {

        this.studentList = studentList;

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