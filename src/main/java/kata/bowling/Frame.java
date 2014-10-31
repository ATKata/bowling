package kata.bowling;

public class Frame {
	private int score1;
	private int score2;


	public int score() {
		return score1 + score2;
	}

	public void roll(int score) {
		this.score1 += score;
	}
}
