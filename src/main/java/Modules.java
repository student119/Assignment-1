import java.util.ArrayList;

public class Modules

{

    String moduleName;
    int moduleID;
    ArrayList <String> studentList = new ArrayList <String> (100);
    ArrayList <String> courseList = new ArrayList <String> (1);

    public Modules (String module, int id, String student, String course)

    {

        setModuleName (module);
        setModuleID (id);
        setStudentList (student);
        setCourseList (course);

    }

    public String getModuleName ()

    {

        return moduleName;

    }

    public void setModuleName (String moduleName)

    {

        this.moduleName = moduleName;

    }

    public int getModuleID ()

    {

        return moduleID;

    }

    public void setModuleID (int moduleID)

    {

        this.moduleID = moduleID;

    }

    public ArrayList <String> getStudentList ()

    {

        return studentList;

    }

    public void setStudentList (String studentList)

    {

        this.studentList.add (studentList);

    }

    public ArrayList <String> getCourseList ()

    {

        return courseList;

    }

    public void setCourseList (String courseList)

    {

        this.courseList.add (courseList);

    }

}