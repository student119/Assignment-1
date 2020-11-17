import java.util.ArrayList;

public class Modules

{

    // Declares a String named moduleName.
    String moduleName;
    // Declares an integer named moduleID.
    int moduleID;
    // Declares an ArrayList of type String named studentList and sets it's initial capacity to 100.
    ArrayList <String> studentList = new ArrayList <String> (100);
    // Declares an ArrayList of type String named coursELists and sets it's initial capacity to 1.
    ArrayList <String> courseList = new ArrayList <String> (1);

    // Constructor Method of Module with parameters of :
    // String name module;
    // Integer named id;
    // ArrayList of type String named student;
    // ArrayList of type String named course.
    public Modules (String module, int id, ArrayList <String> student, ArrayList <String> course)

    {

        // Calls the setter method named setModuleName and passes module as it's parameter.
        setModuleName (module);
        // Calls the setter method named setModuleID and passes id as it's parameter.
        setModuleID (id);
        // Calls the setter method named setStudentList and passes student as it's parameter.
        setStudentList (student);
        // Calls the setter method named setCourseList and passes course as it's parameter.
        setCourseList (course);

    }

    // Method of type String named getModuleName.
    public String getModuleName ()

    {

        // Returns moduleName when called.
        return moduleName;

    }

    // Method of type void named setModuleName with a String named moduleName as it's parameter.
    public void setModuleName (String moduleName)

    {

        // moduleName is set equal to moduleName.
        this.moduleName = moduleName;

    }

    // Method of type integer named getModuleID.
    public int getModuleID ()

    {

        // Returns moduleID when called.
        return moduleID;

    }

    // Method of type void named setModuleID with an integer named moduleID as it's parameter.
    public void setModuleID (int moduleID)

    {

        // moduleID is set equal to moduleID.
        this.moduleID = moduleID;

    }

    // Method of type ArrayList of type String named getStudentList.
    public ArrayList <String> getStudentList ()

    {

        // Returns studentList when called.
        return studentList;

    }

    // Method of type void names setStudentList with an ArrayList of type String named studentList as it's parameter.
    public void setStudentList (ArrayList <String> studentList)

    {

        // studentList is set equal to studentList.
        this.studentList = studentList;

    }

    // Method of type ArrayList of type String named getCourseList.
    public ArrayList <String> getCourseList ()

    {

        // Returns courseList when called.
        return courseList;

    }

    // Method of type void named setCourseList with an ArrayList oftype String named courseList as it's parameter.
    public void setCourseList (ArrayList <String> courseList)

    {

        // courseList is set equal to courseList.
        this.courseList = courseList;

    }

}