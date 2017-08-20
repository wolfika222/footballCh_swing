package utilities;

import connection.ConnectionConfiguration;
import model.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
public class Reader implements IReader {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;


    @Override
    public List<Pairs> getAllHuman() {

        List<Pairs> pairsList = new ArrayList<Pairs>();

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(QueryConstans.GET_ALL_HUMAN);

            while (resultSet.next()) {
                Husband husband = new Husband(resultSet.getString("husband_name"));
                Wife wife = new Wife(resultSet.getString("wife_name"));
                Pairs pairs = new Pairs(husband, wife);
                pairsList.add(pairs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return pairsList;
    }

    @Override
    public List<Husband> getAllHusband() {

        List<Husband> husbandList = new ArrayList<Husband>();

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(QueryConstans.GET_ALL_HUSBAND);

            while (resultSet.next()) {
                Husband husband = new Husband(resultSet.getString("husband_name"));
                husbandList.add(husband);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return husbandList;
    }

    @Override
    public List<Wife> getAllWife() {

        List<Wife> wifeList = new ArrayList<Wife>();

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(QueryConstans.GET_ALL_WIFE);

            while (resultSet.next()) {
                Wife wife = new Wife(resultSet.getString("wife_name"));
                wifeList.add(wife);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return wifeList;
    }

    @Override
    public List<Team> getAllTeam() {

        List<Team> teamList = new ArrayList<Team>();

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(QueryConstans.GET_ALL_TEAM);

            while (resultSet.next()) {
                Team team = new Team();
                team.setTeamName(resultSet.getString("team_name"));
                teamList.add(team);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return teamList;
    }
}
