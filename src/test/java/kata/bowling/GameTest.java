package kata.bowling;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void testNoPinsKnockedDownScoreIsZero() {
		assertThat(game.score(), equalTo(0));
	}

	@Test
	public void testRollNonZeroScoreAddsToTotal() {
		int score = 5;
		game.roll(score);
		assertEquals(5, game.score());
	}

	@Test
	public void testFirstBallOfNextFrameIsDoubledAfterSpare() {
		game.roll(10);
		game.roll(1);
		game.roll(2);

		assertEquals(14, game.score());
	}
}
