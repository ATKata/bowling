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

    @Test
    public void testGutterGame(){
        for(int i=0; i<20; i++){
            bowlingGame.roll(0);
        }
        assertEquals(0,bowlingGame.score());
    }

    @Test
    public void testScoreFirstFrameNoBonuses(){
        bowlingGame.roll(1);
        bowlingGame.roll(2);
        bowlingGame.roll(3);
        assertEquals(3,bowlingGame.scoreFrame(0));
    }

    @Test
    public void testScoreFirstFrameSpare(){
        bowlingGame.roll(9);
        bowlingGame.roll(1);
        bowlingGame.roll(1);
        assertEquals(11,bowlingGame.scoreFrame(0));
    }
    
    @Test
    public void testScoreFrameTwo(){
        bowlingGame.roll(1);
        bowlingGame.roll(2);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        assertEquals(7,bowlingGame.scoreFrame(1));
    }
    
    @Test
    public void testSpareInFrameTwo(){
        bowlingGame.roll(0);
        bowlingGame.roll(0);
        //TODO make rollSpare test helper?
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(1);
        assertEquals(11,bowlingGame.scoreFrame(1));
    }
    
    @Test
    public void testIncompleteSpare(){
    	  bowlingGame.roll(5);
          bowlingGame.roll(5);
          assertEquals(10,bowlingGame.scoreFrame(0));
    }
}
