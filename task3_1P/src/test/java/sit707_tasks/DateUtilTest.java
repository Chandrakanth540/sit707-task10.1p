package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "S223798216";
        Assert.assertNotNull("Student ID is ", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Chandrakanth";
        Assert.assertNotNull("Student name is ", studentName);
    }

   @Test
    public void testAdd() {
        Assert.assertEquals(8, MathUtils.add(5, 3),0);
        Assert.assertEquals(0, MathUtils.add(-3, 3),0);
        Assert.assertEquals(-1, MathUtils.add(-2, 1),0);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(2, MathUtils.sub(5, 3),0);
        Assert.assertEquals(-6, MathUtils.sub(-3, 3),0);
        Assert.assertEquals(-3, MathUtils.sub(-2, 1),0);
        Assert.assertNotNull(MathUtils.add(null, null));
    }
}
