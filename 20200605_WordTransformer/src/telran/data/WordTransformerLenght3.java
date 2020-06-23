package telran.data;

public class WordTransformerLenght3 {

    public boolean check(String word){
        return word.length() == 3;
    }

    public String action(String word){
        return word.toUpperCase();
    }
}
