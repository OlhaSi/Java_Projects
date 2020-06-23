public class Main {

    public static void main(String[] args) {
        System.out.println(diff21(12));
        System.out.println(diff21(28));

        System.out.println(endUp("ice-cream"));

        System.out.println(changeE("ice-cream"));

        String str = "ice-cream";
        System.out.println(str);
        String str2 = changeE(str);
        System.out.println(str2);

        changeE2(str);

        String str3 = str.concat(str2);
        System.out.println();
        System.out.println(str3);

        System.out.println(changeE3("ice-cream"));
    }

    private static int diff21(int n) {
        return n < 21 ? 21 - n : (n - 21) * 2;
    }

    private static String endUp(String str) {
        String end = str.substring(str.length() - 3);
        return str.length() < 3 ? str.toUpperCase() : str.replace(end, end.toUpperCase());
    }

    private static String changeE (String str){
        return str.replace('e', 'E');
    }

    private static void changeE2(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'e'){
                System.out.print('E');
            }else{
                System.out.print(string.charAt(i));
            }
        }
    }

    private static char[] changeE3(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'e')
                chars[i] = 'E';
        }
        return chars;
    }
}
