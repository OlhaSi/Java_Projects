import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Good day";
        String str1 = "One day";
        String str3 = "one, two, three";

        System.out.println(str.compareTo(str1));

        System.out.println(str.charAt(3));
        System.out.println(str.substring(1,3));
        System.out.println("********");
        System.out.println(str.substring(3));
        System.out.println(str.startsWith("Go"));
        System.out.println(str.concat(str1));
        str1 = str + " new " + str1;
        System.out.println(str1);

        char[] chars = str.toCharArray();
        String[] words = str3.split(" ");
        System.out.println(words[0]);

        // "notnow" -> "nownot";
        // "answer" -> "notanswer"

        System.out.println(notString("notlove"));

    }

//    public static String notString(String str){
//        return  str.startsWith("not") ? str.substring(3) + "not" : "not" + str;
//    }

    public static String notString(String str){
        if(str.startsWith("not")){
            return str.substring(3) + "not";
        }
        return "not" + str;
        }
    }

