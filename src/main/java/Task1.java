import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<String> filterByFirstAndLastCharacter(char c, List<String> list){
        return list.stream().filter(s -> s.charAt(0) == c && s.charAt(s.length()-1)==c && s.length()>1).collect(Collectors.toList());
    }
}
