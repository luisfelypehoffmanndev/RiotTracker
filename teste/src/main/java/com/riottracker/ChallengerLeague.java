package com.riottracker;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChallengerLeague {
    private String tier;
    private String leagueId;
    private String queue;
    private String name;
    private String status;
    private List<ChallengerPlayer> entries;

    ChallengerLeague() {

    }

    public String getStatus() {
        return status;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChallengerPlayer> getEntries() {
        return entries;
    }

    public void setEntries(List<ChallengerPlayer> entries) {
        this.entries = entries;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
