public class ReplaceToStar implements WordsChecker {

    @Override
    public boolean checkWord(String word) {
        return word.length() == 2;
    }

    @Override
    public String transformWord(String word) {
        return word.replaceFirst(String.valueOf(word.charAt(0)), "*");
        //return "*" + word.substring(1);
    }
}

