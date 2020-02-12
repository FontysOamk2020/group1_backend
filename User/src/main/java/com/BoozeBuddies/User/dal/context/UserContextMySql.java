package com.BoozeBuddies.User.dal.context;

import com.BoozeBuddies.User.interfaces.IUserContext;
import com.BoozeBuddies.User.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UserContextMySql implements IUserContext {
    private String sqlUrl;
    private String usernameUrl;
    private String passwordUrl;

    // Constructors
    public UserContextMySql() {
        this.sqlUrl = "jdbc:mysql://217.101.44.31/OuluDB";
        this.usernameUrl = "root";
        this.passwordUrl = getPassword();
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    // Methods
    public User getUserByEmail(String email) {
        User userToReturn = new User();

        // create our mysql database connection
        try (Connection conn = DriverManager.getConnection(sqlUrl, usernameUrl, passwordUrl))
        {
            String query = "SELECT * FROM User WHERE email = " + "'" + email + "'";

            // create the java statement
            try (PreparedStatement cst = conn.prepareCall(query))
            {
                try (ResultSet rs = cst.executeQuery(query))
                {
                    // iterate through the java resultset
                    while (rs.next())
                    {
                        userToReturn.setId(rs.getInt("id"));
                    }
                }
            }
        } catch (Exception e)
        {
            System.err.println(e);
            System.err.println("Got an exception in UserContextMySql.getUserByEmail().");
            System.err.println(e.getMessage());
        }

        return userToReturn;
    }

    public String getPassword(){
        return "varken";
    }
}
