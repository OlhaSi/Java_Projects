package telran.controller;

import telran.data.CustomLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int a = 10;
//        Integer bigA = new Integer(10);
//        Integer bigB = a;
//        Integer bigC = Integer.valueOf(a);
//
//        int b = bigA;
//        int c = bigA.intValue();
//
//        System.out.println(b);
//
//        int[] numbers = {1,2,3,5,6,3,3,5};
//
//        CustomLinkedList<Integer> list = new CustomLinkedList<>();
//        list.add(2);
//        list.add(1);
//
//        list.print();
//
//        list.removeByIndex(1);
//        list.print();


        List<String> list = new ArrayList<>();
        list.add("Hello");
        Collections.addAll(list, "world", "one");
        List<String> list2 = new ArrayList<>();
        list2.add("three");

        list.addAll(2, list);
        System.out.println(list);
        list.add(4, "to");

        List<String> list3 = Arrays.asList("aa", "bb", "cc", "dd");
        System.out.println(list3.getClass().getName());
        list.addAll(list3);
        list.add("gg");
        list3 = list2;
        list3.add("try");
        System.out.println(list3.size());

        String[] strings = {"Dan", "David", "Anna"};
        list.addAll(Arrays.asList(strings));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        List<Integer> listNum = new ArrayList<>();
        listNum.addAll(Arrays.asList(1,4,7,5));

        Iterator<Integer> iterator = getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator.remove();
        System.out.println(listNum);

        List<String> list4 = getList();

        list2 = (ArrayList<String>)list2;
        ((ArrayList<String>) list2).trimToSize();
    }

    public static Iterator<Integer> getIterator(){
        List<Integer> listNum = new LinkedList<>();
        listNum.addAll(Arrays.asList(1,4,7,5));
        return listNum.iterator();
    }

    public static List<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        return list;
    }
}
