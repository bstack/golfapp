package entity;

public class CompetitionPlayerScore {
	private int id;
	private int competitionId;
	private int playerId;
	private int actualScore;
	private int score;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(int competitionId) {
		this.competitionId = competitionId;
	}
	public int getActualScore() {
		return actualScore;
	}
	public void setActualScore(int actualScore) {
		this.actualScore = actualScore;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
