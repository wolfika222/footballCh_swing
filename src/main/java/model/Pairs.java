package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Data;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
@Data
public class Pairs {

    private final Human human1;
    private final Human human2;
    private Random random = new Random();
    private List<Match> matches;

    @Override
    public String toString() {
        return human1.getName() + "-" + human2.getName();
    }

    public Pairs(Human human1, Human human2) {
        this.human1 = human1;
        this.human2 = human2;
        this.matches = new ArrayList<Match>();

    }

    public boolean isWatch() {
        return random.nextBoolean();
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getMatches() {
        return matches;
    }

}
