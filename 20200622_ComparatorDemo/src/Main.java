import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listNumbers = Arrays.asList(5,7,8,1,3,4);
        List<String> listStrings = Arrays.asList("aa", "bb", "cc", "dd", "ab", "xy");

        System.out.println(listNumbers);
        System.out.println(listStrings);

        Collections.sort(listNumbers);
        Collections.sort(listStrings);

        System.out.println(listNumbers);
        System.out.println(listStrings);

        Person dan = new Person("Dan", 23);
        Person anna = new Person("Anna", 40);
        Person anna2 = new Person("Anna", 30);
        Person matt = new Person("Matt", 30);

        List<Person> people = Arrays.asList(dan, anna, matt, anna2);
        Collections.sort(people);
        System.out.println(people);

        PersonComparatorByAge comparatorByAge = new PersonComparatorByAge();
        Collections.sort(people, comparatorByAge);
        System.out.println(people);

        List<Person> sortedPersons = new ArrayList<>(people);
        Collections.sort(sortedPersons, comparatorByAge);
        System.out.println(people);

        Collections.sort(people, new PersonComparatorByNameAndAge());
        System.out.println(people);
    }
}
