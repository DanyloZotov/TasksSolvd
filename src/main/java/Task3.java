import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> firstAndLast(List<String> list){
        return  list.stream().map(s -> "" + s.charAt(0) + s.charAt(s.length() - 1)).collect(Collectors.toList());
    }

}
