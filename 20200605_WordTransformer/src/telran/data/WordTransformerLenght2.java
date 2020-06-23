package telran.data;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordTransformerLenght2 extends WordTransformerLenght3 {

    @Override
    public boolean check(String word){
        return word.length() == 2;
    }

    @Override
    public String action(String word){
//        char[] chars = word.toCharArray();
//        chars[0] = '*';
        //return Arrays.toString(chars);
        return word.replaceFirst(String.valueOf(word.charAt(0)), "*");
    }
}

