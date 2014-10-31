package kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Frame> frames = new ArrayList<Frame>();

	public void roll(int score) {
		Frame frame = new Frame();
		frame.roll(score);
		frames.add(frame);
	}

	public int score() {
		int total = 0;
		for (int frameNumber = 0; frameNumber < frames.size(); frameNumber++) {
			Frame frame = frames.get(frameNumber);
			// if (frameNumber =)
			// Frame nextFrame = frames.get(frameNumber + 1);
			// total += frame.score(nextFrame);
		}
		return total;
	}
}
