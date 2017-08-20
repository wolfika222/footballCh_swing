package model;

import lombok.Data;

@Data
public class Team {

    private int id;
    private String teamName;

    @Override
    public String toString() {
        return teamName;
    }
}
