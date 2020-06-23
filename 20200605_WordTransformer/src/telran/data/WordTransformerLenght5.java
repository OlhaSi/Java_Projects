package telran.data;

public class WordTransformerLenght5 extends WordTransformerLenght3{

    @Override
    public boolean check(String word){
        return word.length() == 5;
    }

    @Override
    public String action(String word){
        return word.toLowerCase();
    }
}
