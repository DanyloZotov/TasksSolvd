import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static List<String> getAndSort(int k, List<String> list){
        return list.stream().filter(s -> s.length() == k && Character.isDigit(s.charAt(s.length() - 1))).sorted().collect(Collectors.toList());
    }
}
