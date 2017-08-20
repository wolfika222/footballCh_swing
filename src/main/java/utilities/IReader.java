package utilities;

import model.*;

import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
public interface IReader {

    List<Pairs> getAllHuman();
    List<Husband> getAllHusband();
    List<Wife> getAllWife();
    List<Team> getAllTeam();
}
