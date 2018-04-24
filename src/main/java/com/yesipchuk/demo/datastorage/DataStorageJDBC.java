package com.yesipchuk.demo.datastorage;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;

@Component
public class DataStorageJDBC {
    private static final String url = "jdbc:mysql://localhost:3307/drugstore";
    private static final String login = "root";
    private static final String password = "Dronik210199";

    Connection con;
    Statement statement;

    @PostConstruct
    public void init() throws SQLException {
        con = DriverManager.getConnection(url, login, password);
        statement = con.createStatement();
    }

    public ResultSet executeQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    public DataStorageJDBC() {
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
