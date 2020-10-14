import org.joda.time.DateTime;

public class Students

{

    String studentName;
    int studentAge;
    DateTime studentDOB;
    int studentID;
    String studentUsername;
    String[] studentCourses;
    String[] studentModules;

    public Students (String sName, int sAge)

    {

        sName = studentName;
        sAge = studentAge;

        studentUsername = sName.concat(String.valueOf(studentAge));

    }

}