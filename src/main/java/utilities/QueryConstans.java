package utilities;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
public class QueryConstans {

    public static final String GET_ALL_HUMAN = "SELECT husband_name, wife_name FROM human";
    public static final String GET_ALL_HUSBAND = "SELECT husband_name FROM human";
    public static final String GET_ALL_WIFE = "SELECT wife_name FROM human";
    public static final String GET_ALL_TEAM = "SELECT team_name FROM team";
    public static final String ADD_NEW_HUMAN = "INSERT INTO human (husband_name, wife_name) VALUES (?, ?)";
    public static final String ADD_NEW_TEAM = "INSERT INTO team (team_name) VALUES (?)";
}
