import java.util.HashMap;

public class Example {
    public static void main(String[] args) {

        HashMap<String, String> Map = new HashMap<>();

        Map.put("A", "권");
        Map.put("B", "오");
        Map.put("C", "근");

        System.out.println(Map.containsKey("A"));
        System.out.println(Map.containsKey("D"));
    }
}
