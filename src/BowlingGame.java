import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

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
		return score;
		}
	}
	private void checkGameEnded() {
		if (player1Points>=4 && player1Points-player2Points>=2)
			GameOver = true;
		else if (player2Points>=4 && player2Points-player1Points>=2)
			GameOver = true;
	}
}
