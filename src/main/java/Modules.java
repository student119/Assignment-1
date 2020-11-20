// Imports the java util ArrayList library.
import java.util.ArrayList;

// Public method of type class named Modules.
public class Modules

{

    // Declares a String named moduleName.
    String moduleName;
    // Declares an integer named moduleID.
    int moduleID;
    // Declare an ArrayList of type Students named studentList and sets it's initial capacity to 100.
    ArrayList <Students> studentList = new ArrayList <Students> (100);
    // Declares an ArrayList of type Course named courseList and sets it's initial capacity to 10.
    ArrayList <Course> courseList = new ArrayList <Course> (10);

    // Public constructor method of Modules with parameters of:
    // String named module;
    // Integer named ID;
    public Modules (String module, int ID)

    {

        // Calls the setter method named setModuleName with module as it's parameter.
        setModuleName (module);
        // Calls the setter method named setModuleID with ID as it's parameter.
        setModuleID (ID);

    }

    // Public method of type String named getModuleName.
    public String getModuleName ()

    {

        // Returns moduleName when called.
        return moduleName;

    }

    // Public method of type void named setModuleName with a String named moduleName as it's parameter.
    public void setModuleName (String moduleName)

    {

        // moduleName is set equal to moduleName.
        this.moduleName = moduleName;

    }

    // Public method of type integer named getModuleID.
    public int getModuleID ()

    {

        // Returns moduleID when called.
        return moduleID;

    }

    // Public method of type void named setModuleID with an integer named moduleID as it's parameter.
    public void setModuleID (int moduleID)

    {

        // moduleId is set equal to moduleID.
        this.moduleID = moduleID;

    }

    // Public method of type ArrayList of type Students named getStudentList.
    public ArrayList <Students> getStudentList ()

    {

        // Returns studentList when called.
        return studentList;

    }

    // Public method of type void named setStudentList with a Students named studentList as it's parameter.
    public void setStudentList (Students studentList)

    {

        // studentList is set equal to studentList.
        this.studentList.add (studentList);

    }

    // Public method of type ArrayList of type Course named getCourseList.
    public ArrayList <Course> getCourseList ()

    {

        // Returns courseList when called.
        return courseList;

    }

    // Public method of type void named setCourseList with a Course named courseList as it's parameter.
    public void setCourseList (Course courseList)

    {

        // courseList is added to courseList.
        this.courseList.add (courseList);

    }

    @Override
    public String toString ()

    {

        return "Name : " + moduleName + "\n"
                + "ID : " + moduleID + "\n"
                + "Students : " + studentList + "\n"
                + "Course : " + courseList + "\n";

    }

}