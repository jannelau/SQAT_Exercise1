public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() throws BowlingException {
		return firstThrow;
	}

	public int getSecondThrow() throws BowlingException {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike() throws BowlingException {

		if (firstThrow == 10){
			return true;
		}else{return false;}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare() throws BowlingException {
		//to be implemented
		return false;
	}
}
