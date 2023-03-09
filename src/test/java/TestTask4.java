import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTask4 {
    @Test
    public void testGetAndSort() {
        List<String> list = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
        Assert.assertEquals(Task4.getAndSort(2, list), Arrays.asList("A1", "S3"));
    }

    @Test
    public void testGetAndSortIsNotNull() {
        List<String> list = Collections.emptyList();
        Assert.assertNotNull(Task3.firstAndLast(list));
    }
}
