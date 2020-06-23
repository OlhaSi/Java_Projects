package telran.data;

public class WordTransformer {

    public static String wordTransformer(String input){
        return WordTransformer.wordTransformer(input, new WordTransformerLenght3());
    }

    public static String wordTransformer(String string, WordTransformerLenght3 wt){
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if(wt.check(word)){
                strings[i] = wt.action(word);
            }
        }
        return String.join(" ", strings);
    }
}
