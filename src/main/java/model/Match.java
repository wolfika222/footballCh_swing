package model;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
public class Match {

    @Override
    public String toString() {
        return team1 + " : " + team2;
    }

    public boolean isMatchIsGood() {
        return random.nextBoolean();
    }

    Random random = new Random();
    private final int PLAY_TIME = 90;
    private final int uptime = random.nextInt(10) + 0;
    private Team team1, team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public int matchDuration() {
        return PLAY_TIME + uptime;
    }
}
