import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void testGame1(){
        //1. specify test input
        CorrectNumberGameFinalMessenger gm = new CorrectNumberGameFinalMessenger();
        CorrectConsoleGameNumberReader gr= new CorrectConsoleGameNumberReader();
        int attempts = 2;
        int secret = 3;

        //2. run test method
        Game g = new Game(attempts, secret, gm, gr);
        g.play();

        //3. check the output
        assertTrue(gm.isCorrect());
    }

    @Test
    public void testGame2(){
        //1. specify test input
        CorrectNumberGameFinalMessenger gm = new CorrectNumberGameFinalMessenger();
        CorrectConsoleGameNumberReader gr= new CorrectConsoleGameNumberReader();
        int attempts = 2;
        int secret = 2;

        //2. run test method
        Game g = new Game(attempts, secret, gm, gr);
        g.play();

        //3. check the output
        assertFalse(gm.isCorrect());
    }
}
