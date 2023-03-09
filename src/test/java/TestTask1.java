import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTask1 {

    @Test
    public void testFilterByFirstAndLastCharacter() {
        List<String> list = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
        Assert.assertEquals(Task1.filterByFirstAndLastCharacter('a', list), Arrays.asList("asda", "asdfa"));
    }

    @Test
    public void testFilterByFirstAndLastCharacterIsNotNull() {
        List<String> list = Collections.emptyList();
        Assert.assertNotNull(Task1.filterByFirstAndLastCharacter('a', list));
    }

}
