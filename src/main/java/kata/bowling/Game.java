package kata.bowling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.oldfield on 24/10/2014.
 */


public class Game {

    private int score;
    private List<Integer> rolls = new ArrayList<Integer>();

    public void roll(int pins){
        rolls.add(pins);
        score += pins;
    }

    public int score(){
        return score;
    }

    public int scoreFrame(int frameNo){
        if(rolls.get(0) + rolls.get(1) == 10){
            return rolls.get(0) + rolls.get(1) + rolls.get(2);
        } else {
            return rolls.get(0) + rolls.get(1);
        }
    }
}
