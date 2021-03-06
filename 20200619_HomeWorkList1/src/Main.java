import java.util.*;

public class Main {

    public static void main(String[] args) {

        // method 2
        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia"));
        System.out.println(removeNameWith4Letters(names));

        // method 3
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 4, 7, 5));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 7, 7));
        System.out.println(compareLists(list1, list2));

        // method 4
        List<String> stringArrayList1 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        List<String> stringArrayList2 = new ArrayList<>(Arrays.asList("cc", "dd", "aa", "bb"));
        System.out.println(IsItCycle(stringArrayList1, stringArrayList2));

        // method 5
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseList(integerList));

        // method 6
        List<Object> objectList1 = new ArrayList<>(Arrays.asList(1000, "dollars"));
        List<Object> objectList2 = new ArrayList<>(Arrays.asList(2000, "euros"));
        System.out.println(mergeLists(objectList1, objectList2));

        // method 7
        System.out.println(withoutElements(integerList, 3));
    }

    private static List<String> removeNameWith4Letters(List<String> names) {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() == 4)
                iterator.remove();
        }
        return names;
    }

    private static List<String> compareLists(List<Integer> list1, List<Integer> list2) {
        List<String> compareResult = new LinkedList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                compareResult.add("Yes");
            } else
                compareResult.add("No");
        }
        return compareResult;
    }

    private static boolean IsItCycle(List<String> list1, List<String> list2) {
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                Collections.rotate(list1, 2);
                if (list1.equals(list2))
                    return true;
            }
        }
        return false;
    }

    private static List<Integer> reverseList (List<Integer> list){
        Collections.reverse(list);
        return list;
    }

    private static List<Object> mergeLists (List<Object> list1, List<Object> list2){
        list1.addAll(list2);
        return list1;
    }

    public static List<Integer> withoutElements (List <Integer> list, int n){
        List<Integer> listWithoutElements = new LinkedList<>();
        for (Integer integer : list) {
            if (integer <= n) {
                listWithoutElements.add(integer);
            }
        }
        return listWithoutElements;
    }
}
