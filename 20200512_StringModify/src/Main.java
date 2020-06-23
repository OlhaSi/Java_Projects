import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println(getRepeatChar("aaabbcdddd"));
        //getRepeat("aaabbcdddd");
        //aaabbcdddd ->a3b2c1d4

       /* boolean b = true;
        String str = "b is " + b;
        System.out.println(str);
        //int a = 5;
        str = "b is " + 5;
        System.out.println(str);
        String a = "Vasya";
        String c = "Vasya";
        System.out.println(a==c);
        c = c.substring(0,4);
        c = c.concat("a");
        System.out.println(a==c);*/

        String str = "world";
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        StringBuffer stringBuffer1 = new StringBuffer("hallo");
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer.length());
        StringBuffer stringBuffer2 = new StringBuffer(50);
        CharSequence chars = str.subSequence(0, 3);
        StringBuffer stringBuffer3 = new StringBuffer(str.substring(0, 3));
        stringBuffer1.ensureCapacity(35);

        stringBuffer2.append("hallo");
        System.out.println(stringBuffer2.capacity());
        stringBuffer.append("Hallo ").append("my ").append(6).append(" friend!");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        stringBuffer1.setCharAt(1, 'e');
        System.out.println(stringBuffer1);
        stringBuffer1.insert(5, " !");
        System.out.println(stringBuffer1);

        stringBuffer1.delete(6, 7);
        System.out.println(stringBuffer1);

        stringBuffer.setLength(13);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(0));

        System.out.println(stringBuffer1.reverse());

        int[] nums = {1, 2, 3};
        stringBuffer.append(" ").append(false).append(3).append("kuku").append(Arrays.toString(nums)).append(";");
        System.out.println(stringBuffer);

        StringBuffer str1 = new StringBuffer("012934567");
        System.out.println(str1.insert(3, "ASDGHJ"));


        System.out.println(sumNumbers("012934567"));
        String s = "012934567";
        int num = Integer.parseInt(s);
        System.out.println(num);


        // Home work
        //public static boolean dateValidator(int day, int month, int year){} -> true/false
        // "0340678001" ->  "346781"

        System.out.println(removeZero("0340678001"));

        System.out.println(dateValidator(31, 1, 2000));

    }

    private static String removeZero(String input) {
        return input.replace("0", "");
    }

    public static boolean dateValidator(int day, int month, int year) {
        if (month > 12) {
            return false;
        } else if (validateEvenMonth(day, month)) {
            return true;
        } else if (month == 2) { // february
            return validateFebruary(year, day);
        }
        if (day == 30) {
            return true;
        }
        return false;
    }

    private static boolean validateEvenMonth(int day, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateFebruary(int year, int day) {
        if (year % 4 == 0) {
            if (day == 29) {
                return true;
            }
            return false;
        }
        if (day == 28) {
            return true;
        }
        return false;
    }


    private static int sumNumbers(String input) {
        int sum = 0;
        String[] numbers = input.split("");
        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private static String getRepeatChars(String input) {
        StringBuffer fin = new StringBuffer();
        fin.append(input.charAt(0));
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                count++;
            } else {
                fin.append(count).append(input.charAt(i));
                count = 1;
            }
        }
        fin.append(count);
        return fin.toString();
    }

    private static String getRepeatChar(String input) {
        int count = 1;
        String res = input.charAt(0) + "";
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i))
                count++;
            else {
                res = res + count + " " + input.charAt(i);
                count = 1;
            }
        }
        res = res + count;
        return res;
    }


    private static void printRepeatChar(String input) {
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i))
                count++;
            else {
                System.out.print("" + input.charAt(i - 1) + count + " ");
                ;
                count = 1;
            }
        }
        System.out.print("" + input.charAt(input.length() - 1) + count);
    }

}


