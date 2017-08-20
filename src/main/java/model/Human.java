package model;


import lombok.Data;

import java.util.Random;

@Data
public abstract class Human {


    private int id;
    private String Name;
    Random random = new Random();

    public Human(String Name) {
        this.Name = Name;
    }

    public abstract void setScore(Match match);

    public abstract int getScore();


}

