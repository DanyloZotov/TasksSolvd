import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> getLengths(List<String> list){
        return list.stream().sorted(Comparator.comparingInt(String::length)).map(String::length).collect(Collectors.toList());
    }
}
