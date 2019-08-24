package com.citadelglobal.ranking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
public class CitadelRanking {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long acces;
    private String user;
    private String pass;
    private int score;
    private int extrastype;
    private int funds;
    private LocalDate joindate;
    private LocalDate lastdate;
    private LocalDate lastfunds;
    private int kills;
    private int deaths;

    public CitadelRanking(String user, String pass, int score, int extrastype, int funds, LocalDate joindate,
                          LocalDate lastdate, LocalDate lastfunds, int kills, int deaths) {
        this.user = user;
        this.pass = pass;
        this.score = score;
        this.extrastype = extrastype;
        this.funds = funds;
        this.joindate = joindate;
        this.lastdate = lastdate;
        this.lastfunds = lastfunds;
        this.kills = kills;
        this.deaths = deaths;
    }

    public CitadelRanking(){}


    public Long getAcces() {
        return acces;
    }

    public void setAcces(Long acces) {
        this.acces = acces;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getExtrastype() {
        return extrastype;
    }

    public void setExtrastype(int extrastype) {
        this.extrastype = extrastype;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public LocalDate getJoindate() {
        return joindate;
    }

    public void setJoindate(LocalDate joindate) {
        this.joindate = joindate;
    }

    public LocalDate getLastdate() {
        return lastdate;
    }

    public void setLastdate(LocalDate lastdate) {
        this.lastdate = lastdate;
    }

    public LocalDate getLastfunds() {
        return lastfunds;
    }

    public void setLastfunds(LocalDate lastfunds) {
        this.lastfunds = lastfunds;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
