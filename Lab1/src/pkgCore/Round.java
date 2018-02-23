package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		
		rolls.add(new Roll());
		ComeOutScore = rolls.getLast().getScore();
		
		if((ComeOutScore == 7) || (ComeOutScore == 11)) {
			eGameResult = eGameResult.NATURAL;
		}
		else if((ComeOutScore == 2) || (ComeOutScore == 3) || (ComeOutScore == 12)) {
			eGameResult = eGameResult.CRAPS;
		}
		else {
			
			do { 
				rolls.add(new Roll());				
			} while ((rolls.getLast().getScore() != 7) && (ComeOutScore != rolls.getLast().getScore()));
			
			if(rolls.getLast().getScore() == 7) {
				eGameResult = eGameResult.SEVEN_OUT;
			}
			else
				eGameResult = eGameResult.POINT;
		}
	}

	public int RollCount() {
		return rolls.size();
	}
	
}
