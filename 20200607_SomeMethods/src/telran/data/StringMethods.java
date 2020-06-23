package telran.data;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println(isPalindrome("MADAM IM ADAM"));

        System.out.println(isWordPalindrome("НАГАН"));

        System.out.println(nonStart("shotl", "java"));

        System.out.println(middleTwo("code"));

    }

    public static boolean isPalindrome(String text){
        text = text.replaceAll(" ", "");
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        String newText = str.toString();

        return text.equalsIgnoreCase(newText);
    }

    private static boolean isWordPalindrome(String s){
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    private static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    private static String middleTwo(String str) {
        int middle = str.length() / 2;
        //int end = start + 2;

        return str.substring(middle - 1, middle + 1);
    }
}
