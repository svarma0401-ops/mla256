package com.test.model;


public class Player {

    private int playerId;
    private String playerName;
    private String state;
    private int totalRuns;
    private double avgScore;
    private double bowlingAvg;

    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public int getTotalRuns() {
        return totalRuns;
    }
    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public double getAvgScore() {
        return avgScore;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public double getBowlingAvg() {
        return bowlingAvg;
    }
    public void setBowlingAvg(double bowlingAvg) {
        this.bowlingAvg = bowlingAvg;
    }
    
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", state=" + state + ", totalRuns="
				+ totalRuns + ", avgScore=" + avgScore + ", bowlingAvg=" + bowlingAvg + "]";
	}
	
    

 
}
