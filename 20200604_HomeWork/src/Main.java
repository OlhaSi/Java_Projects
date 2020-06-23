public class Main {

    public static void main(String[] args) {

        String str = "aaa Ghklj kj jjj";

        System.out.println(wordTransformer(str));

        System.out.println(transformer(str));

    }

    private static String wordTransformer(String str) {
        String input = str;
        if(str.length() >= 6) {
            String first = str.substring(0, 3);
            String rest = str.substring(3, str.length() - 3);
            String last = str.substring(str.length() - 3);
            return first.toUpperCase() + rest + last.toUpperCase();
        } else
            return input;
    }

    private static String transformer(String str){
        String [] words = str.split(" ");
        String res = "";
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length() == 3 ){
                res += words[i].toUpperCase() + " ";
            } else {
                res += words[i] + " ";
            }
        }
        return res;
    }
}
