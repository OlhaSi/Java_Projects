public class Main {

    public static void main(String[] args) {
        char myChar = 'z';
        int i = (int) myChar;

        System.out.println("ASCII value " + i);
        System.out.println(Character.getNumericValue(myChar));
        System.out.println(myChar == 97);

        String str = "Hello my friend!";

        int key;

        System.out.println(codeWords("Hello my friend!", 3));


    }

    private static String codeWords(String str, int key){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                if(str.charAt(i) + key > 90){
                    sb.append((char) (str.charAt(i) - key));
                }else
                    sb.append((char) (str.charAt(i) + key));
            }else if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
                if(str.charAt(i) + key > 122){
                    sb.append((char) (str.charAt(i) - key));
                }else
                    sb.append((char) (str.charAt(i) + key));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
