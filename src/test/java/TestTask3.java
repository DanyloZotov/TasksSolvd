import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTask3 {
    @Test
    public void testMap() {
        List<String> list = Arrays.asList("asd", "a", "basdw");
        Assert.assertEquals(Task3.firstAndLast(list), Arrays.asList("ad", "aa", "bw"));
    }

    @Test
    public void testMapIsNotNull() {
        List<String> list = Collections.emptyList();
        Assert.assertNotNull(Task3.firstAndLast(list));
    }
}
