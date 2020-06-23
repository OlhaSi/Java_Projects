import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> animalsMap = new TreeMap<>();
        animalsMap.put(52, "elephants");
        animalsMap.put(31, "zebras");
        animalsMap.put(43, "monkeys");
        animalsMap.put(1, "crocodile");
        animalsMap.put(15, "tigers");
        animalsMap.put(0, "people");

        System.out.println(animalsMap);
        // get key and value -> false example
        for (int i = 0; i < animalsMap.size(); i++) {
            System.out.println(animalsMap.get(i));
        }

        // get key and value -> true example
        for(Map.Entry<Integer, String> entry : animalsMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // change key value -> old value will be removed
        Map<String, String> map = new TreeMap<>();
        map.put("1", "a");
        map.put("1", "b");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        } // Output: 1 b

        // change key value with setValue
        Map<String, String> mapWithSet = new TreeMap<>();
        mapWithSet.put("1", "a");
        mapWithSet.put("2", "b");
        mapWithSet.put("3", "c");
        for(Map.Entry<String, String> entry : mapWithSet.entrySet())
            if("2".equals(entry.getKey()))
                entry.setValue("x");
            System.out.println(mapWithSet);
        // Output: {1=a, 2=x, 3=c}

        // remove using key or value (.value)
        Map<String, String> mapToRemove = new TreeMap<>();
        mapToRemove.put("1", "a");
        mapToRemove.put("2", "b");
        mapToRemove.put("3", "c");
        for (Iterator<String> i = mapToRemove.values().iterator(); i.hasNext(); )
            if ("b".equals(i.next()))
                i.remove();
            System.out.println(mapToRemove);
        // Output: {1=a, 3=c}

        Map<String, String> map1 = new TreeMap<>();
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        System.out.println(map1.get("1"));            // .get (K): V

        System.out.println(map1.remove("1"));    // another option to remove (K): V
        System.out.println(map1);

        System.out.println(map1.isEmpty());           // .isEmpty

        System.out.println(map1.containsKey("3"));   // .contains key or value- boolean

        System.out.println(map1.values());             // .values

    }
}
