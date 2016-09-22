import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void ScoreTest() {
		BowlingGame bowl = new BowlingGame();
		Frame frame = new Frame(1,1);
		bowl.addFrame(frame);
		bowl.score();
		fail("Not yet implemented");
	}

}
