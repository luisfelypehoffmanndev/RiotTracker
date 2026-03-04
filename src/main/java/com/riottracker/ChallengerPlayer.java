package com.riottracker;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChallengerPlayer {
    private String summonerId;
    private String puuid;
    private int leaguePoints;
    private String rank;
    private int wins;
    private int losses;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;

    ChallengerPlayer() {

    }

    public String getSummonerId() {
        return summonerId;
    }

    public String getPuuid() {
        return puuid;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public String getRank() {
        return rank;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isInactive() {
        return inactive;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public void setHotStreak(boolean hotStreak) {
        this.hotStreak = hotStreak;
    }
}
