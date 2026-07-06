import java.util.EnumMap;
// import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Map<Day, String> map = new HashMap<>();
        // all possible keys are known in advance(noi hashning and use of ordinals)
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Microservices learning"); // order is maintained


        
        
    }
}

enum Day { // enum used to store constants
    SUNDAY,MONDAY,TUESDAY
}