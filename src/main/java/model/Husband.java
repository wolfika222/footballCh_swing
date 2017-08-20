package model;

import java.util.Random;

public class Husband extends Human {

    private final int GOOD_NUMBER = 3;
    private final int BAD_NUMBER = 1;
    private int numbersOfBeers = 0;

    private final int matchIsGood = random.nextInt(10) + 0;

    public Husband(String Name) {
        super(Name);
    }

    @Override
    public String toString() {
        return super.getName() + " " + getScore() + " sört ivott";
    }

    @Override
    public void setScore(Match match) {
        if (match.isMatchIsGood()) {
            numbersOfBeers += GOOD_NUMBER;
        } else {
            numbersOfBeers += BAD_NUMBER;
        }
    }

    public int getScore() {
        return numbersOfBeers;
    }
}
