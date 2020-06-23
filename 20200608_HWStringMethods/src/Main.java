import sun.swing.DefaultLayoutStyle;

public class Main {

    public static void main(String[] args) {

        String str = "Have a nice day";
        findChars(str, 'e', 'a');

        compareStrings("djwwffjd", "skhf");

    }

    public static void findChars(String str, char c, char b){
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == c || str.charAt(i) == b){
               System.out.println(str.charAt(i));
               return;
           }
        }
        System.out.println("There is no char in the sentence");
    }

    public static void compareStrings(String str1, String str2){
        if(str1.length() == str2.length()){
            System.out.println("Strings have equals number of elements");
        } else if (str1.length() > str2.length()){
            System.out.println(str1.length() - str2.length());
        } else
            System.out.println(str2.length() - str1.length());
    }
}
