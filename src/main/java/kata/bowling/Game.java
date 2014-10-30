package kata.bowling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.oldfield on 24/10/2014.
 */

public class Game {

	private int score;
	private List<Integer> rolls = new ArrayList<Integer>();

	public void roll(int pins) {
		rolls.add(pins);
		score += pins;
	}

	public int score() {
		return score;
	}

	public int scoreFrame(int frameNo) {
		int firstRollOfFrame = frameNo * 2;

		int frameTotal = frameTotal(firstRollOfFrame);

		if (isSpare(frameTotal) && isSpareScoreComplete(firstRollOfFrame)) {

			return frameTotal + rolls.get(firstRollOfFrame + 2);
		}
		return frameTotal;
	}

	private boolean isSpareScoreComplete(int firstRollOfFrame) {
		return rolls.size() > firstRollOfFrame + 2;
	}

	private boolean isSpare(int frameTotal) {
		return frameTotal == 10;
	}

	private int frameTotal(int firstRollOfFrame) {
		return rolls.get(firstRollOfFrame) + rolls.get(firstRollOfFrame + 1);
	}
}
