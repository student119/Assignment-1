// Imports the java util ArrayList library.
import java.util.ArrayList;

// Public method of type class named Modules.
public class Modules

{

    // Declares a String named moduleName.
    String moduleName;
    // Declares an integer named moduleID.
    int moduleID;
    // Declare an ArrayList of type String named studentList and sets it's initial capacity to 100.
    ArrayList <String> studentList = new ArrayList <String> (100);
    // Declares an ArrayList of type String named courseList and sets it's initial capacity to 10.
    ArrayList <String> courseList = new ArrayList <String> (10);

    // Public constructor method of Modules with parameters of:
    // String named module;
    // Integer named ID;
    // String named student;
    // String named course.
    public Modules (String module, int ID, String student, String course)

    {

        // Calls the setter method named setModuleName with module as it's parameter.
        setModuleName (module);
        // Calls the setter method named setModuleID with ID as it's parameter.
        setModuleID (ID);
        // Calls the setter method named setStudentList with student as it's parameter.
        setStudentList (student);
        // Calls the setter method named setCourseList with course as it's parameter.
        setCourseList (course);

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

    // Public method of type ArrayList of type String named getStudentList.
    public ArrayList <String> getStudentList ()

    {

        // Returns studentList when called.
        return studentList;

    }

    // Public method of type void named setStudentList with a String named studentList as it's parameter.
    public void setStudentList (String studentList)

    {

        // studentList is set equal to studentList.
        this.studentList.add (studentList);

    }

    // Public method of type ArrayList of type String named getCourseList.
    public ArrayList <String> getCourseList ()

    {

        // Returns courseList when called.
        return courseList;

    }

    // Public method of type void named setCourseList with a String named courseList as it's parameter.
    public void setCourseList (String courseList)

    {

        // courseList is added to courseList.
        this.courseList.add (courseList);

    }

}