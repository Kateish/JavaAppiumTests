import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();
    int actualInt = mainClass.getLocalNumber();
    int expectedInt = 14;
    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals("ints are not equal", expectedInt, actualInt);
    }
    @Test
    public void failingTest(){
       this.expectedInt = 8;
       testGetLocalNumber();
    }

}
