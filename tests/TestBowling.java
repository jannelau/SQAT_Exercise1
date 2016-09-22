import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void Test() {

		fail("Not yet implemented");
	}
	
	@Test
	//testing my bad coding
	public void FirstFrameAddScoreTest() {
		BowlingGame bowl = new BowlingGame();
		Frame frame1 = new Frame(5,2);
		bowl.addFrame(frame1);
		Frame frame2 = new Frame(8,1);
		bowl.addFrame(frame2);
		
		bowl.score();
		assertEquals("Score not even implemented yet", 2, bowl.score);
	}
	@Test
	//testing my bad coding
	public void StrikeTest(){
		
	}
}
