import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(FirstTests.myAdd(2, 3), 5);
    }

}
