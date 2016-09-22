import java.util.ArrayList;
import java.util.List;

//Finish time: 1650
//ID: 127

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	public int score;
	public boolean GameOver = false;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	private void checkGameEnded() {
		if (score == 300)
			GameOver = true;
		else{
			GameOver = true;}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow)throws BowlingException {
		//if (isStrike){
			
		//}
	}
	
	// Returns the game score
	public int score() throws BowlingException {
		//to be implemented: should return game score 
		if (GameOver){
			throw new BowlingException();
		}else{
		checkGameEnded();
		return score;

		}
	}

}
