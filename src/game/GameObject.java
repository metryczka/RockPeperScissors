package game;

enum GameObject {
	ROCK, PAPER, SCISSORS;
	
	static{
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
		
	}
	
	private GameObject beats; 

	
	boolean beats(GameObject other) {
		return this.beats == other;
		
	}
	boolean tie(GameObject other) {
		return this == other;
	}
	
}
