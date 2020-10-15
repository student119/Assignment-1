import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest

{

    private Course courseRandom;
    private DateTime start = new DateTime(2022, 6, 2, 0, 0);
    private DateTime end = new DateTime(2026, 11, 3, 0, 0);

    @Before
    public void setup()

    {

        courseRandom = new Course("Course", start, end);

    }

    @Test
    public void startDateTest()

    {

        assertEquals(courseRandom.getStartDate(), start);

    }

    @Test
    public void startEndTest()

    {

        assertEquals(courseRandom.getEndDate(), end);

    }

}