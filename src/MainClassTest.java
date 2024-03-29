import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();
    int actualInt = mainClass.getLocalNumber();
    int expectedInt = 14;
    int numberFromTask2 = mainClass.getClassNumber();
    String stringFromTask3 = mainClass.getClassString();

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("ints are not equal", expectedInt, actualInt);
    }

    @Test
    public void failingTest() {
        this.expectedInt = 8;
        testGetLocalNumber();
    }

    //the test below is expected to fail
    @Test
    public void testGetClassNumber() {

        Assert.assertTrue("the value is less than 45", numberFromTask2 > 45);
    }

    //test3
    @Test
    public void testGetClassString() {
        Assert.assertTrue("the substring hello|Hello wasn't found", stringFromTask3.replace(", world", "").equalsIgnoreCase("hello"));
    }
}
