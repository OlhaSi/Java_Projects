package telran.controller;

import telran.data.WordTransformer;
import telran.data.WordTransformerLenght2;
import telran.data.WordTransformerLenght3;
import telran.data.WordTransformerLenght5;

public class Main {

    public static void main(String[] args) {
        WordTransformerLenght3 wt3 = new WordTransformerLenght3();

        String wordToUpperCase = WordTransformer.wordTransformer("aafd Fgg gg OpO lll", wt3);
        String wordToLowerCase = WordTransformer.wordTransformer("AAAFD Fgg gg OpO LLL", new WordTransformerLenght5());
        String wordReplaceStar = WordTransformer.wordTransformer("AAAFD Fgg gg OpO gg LLL", new WordTransformerLenght2());

        System.out.println(wordToUpperCase);
        System.out.println(wordToLowerCase);
        System.out.println(wordReplaceStar);
    }
}
