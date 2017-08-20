package model;

public class Wife extends Human {


    private int freeTime = 0;

    public Wife(String Name) {
        super(Name);
    }

    @Override
    public String toString() {
        return super.getName() + " szabadideje: " + getScore() + " perc";
    }

    @Override
    public int getScore() {
        return freeTime;
    }

    @Override
    public void setScore(Match match) {
        freeTime += match.matchDuration();
    }
}

