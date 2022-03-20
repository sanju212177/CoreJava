package com.capgemini.Feb17;

public class Players {
	private int playerId;
	private String name;
    private String team;
    public Players() {
    }
    public Players(int playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }
    public Players(int playerId, String name, String team) {
        this.playerId = playerId;
        this.name = name;
        this.team = team;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
