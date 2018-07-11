package DAO;


import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class TronBDDConnectorTest {

    private static TronBDDConnector connector;

    private static String user     = "root";
    private static String password = "";
    private static String url      = "jdbc:mysql://localhost/tron?useSSL=false&serverTimezone=UTC";

    private static Connection connection;
    private static Statement statement;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        connector = new TronBDDConnector();
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }


    /**
     * Check that the call is not null (null if query fail)
     */
    @Test
    public void prepareCall() {
        try {
            assertNotNull(connector.prepareCall("CALL insertdata(?,?)").executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Check that the good class is return
     */
    @Test
    public void getInstance() {
        assertEquals(connector.getInstance().getClass(),TronBDDConnector.class);
    }

    /**
     * Check that the good class is return
     */
    @Test
    public void getConnection() {
        assertEquals(connector.getConnection().getClass(),ConnectionImpl.class);
    }
    /**
     * Check that connection is set correctly
     */
    @Test
    public void setConnection() {
        connector.setConnection(connection);
        assertEquals(connector.getConnection(),connection);
    }
    /**
     * Check that the good class is return
     */
    @Test
    public void getStatement() {
        assertEquals(connector.getStatement().getClass(),StatementImpl.class);
    }
    /**
     * Check that statement is set correctly
     */
    @Test
    public void setStatement() {
        connector.setStatement(statement);
        assertEquals(connector.getStatement(),statement);
    }
}