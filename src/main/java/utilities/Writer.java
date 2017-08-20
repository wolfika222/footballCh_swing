package utilities;

import connection.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Hp_Workplace on 2017. 08. 16..
 */
public class Writer implements IWriter {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;

    @Override
    public void addNewHuman(String newHusbandName, String newWifeName) {

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstans.ADD_NEW_HUMAN);
            preparedStatement.setString(1, newHusbandName);
            preparedStatement.setString(2, newWifeName);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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
    }


    @Override
    public void addNewTeam(String newTeamName) {

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstans.ADD_NEW_TEAM);
            preparedStatement.setString(1, newTeamName);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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
    }

}
