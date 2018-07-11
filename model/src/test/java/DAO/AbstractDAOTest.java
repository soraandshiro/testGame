package DAO;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class AbstractDAOTest {

    private static String user     = "root";
    private static String password = "";
    private static String url      = "jdbc:mysql://localhost/tron?useSSL=false&serverTimezone=UTC";

    private static Connection connection;
    private static Statement statement;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }



    /**
     * Check that the call is not null (null if query fail)
     */
    @Test
    public void prepareCall() {
        try {
            assertNotNull(AbstractDAO.prepareCall("CALL insertdata(?,?)").executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
