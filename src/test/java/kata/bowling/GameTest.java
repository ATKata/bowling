package kata.bowling;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by john.oldfield on 24/10/2014.
 */
public class GameTest {

    private Game bowlingGame;

    @Before
    public void setUp(){
        bowlingGame = new Game();
    }

    @Test
    public void testBowlZero(){
        bowlingGame.roll(0);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testBowlOneExpectsScoreOne(){
        bowlingGame.roll(1);
        assertEquals(1,bowlingGame.score());
    }

    public void testGutterGame(){
        for(int i=0; i<20; i++){
            bowlingGame.roll(0);
        }
        assertEquals(0,bowlingGame.score());
    }

    public void testScoreFirstFrameNoBonuses(){
        bowlingGame.roll(1);
        bowlingGame.roll(2);
        bowlingGame.roll(3);
        assertEquals(3,bowlingGame.scoreFrame(1));
    }

    public void testScoreFirstFrameNoBonuses2(){
        bowlingGame.roll(9);
        bowlingGame.roll(0);
        bowlingGame.roll(3);
        assertEquals(9,bowlingGame.scoreFrame(1));
    }

    public void testScoreFirstFrameSpare(){
        bowlingGame.roll(9);
        bowlingGame.roll(1);
        bowlingGame.roll(1);
        assertEquals(11,bowlingGame.scoreFrame(1));
    }

// test combining 2 frames
}
