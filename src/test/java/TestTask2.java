import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTask2 {
    @Test
    public void testConvert() {
        List<String> list = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
        Assert.assertEquals(Task2.getLengths(list), Arrays.asList(1, 1, 4, 5, 5, 7));
    }

    @Test
    public void testConvertIsNotNull() {
        List<String> list = Collections.emptyList();
        Assert.assertNotNull(Task2.getLengths(list));
    }

    @Test
    public void testWithEmptyString(){
        List<String> list = Arrays.asList("Hello", "world", "!", "", "Good", "morning", "!");
        Assert.assertEquals(Task2.getLengths(list), Arrays.asList(0, 1, 1, 4, 5, 5, 7));
    }
}
