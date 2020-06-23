public class CorrectNumberGameFinalMessenger implements GameMessenger {

    private boolean isCorrect = false;

    @Override
    public void print(String s) {
        isCorrect = s.equals("You won!");
    }

    public boolean isCorrect(){
        return isCorrect;
    }
}
