import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void ScoreTest() {
		BowlingGame bowl = new BowlingGame();
		bowl.addFrame(1,1);
		bowl.score();
		//fail("Not yet implemented");
	}

}
