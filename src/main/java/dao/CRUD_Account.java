package dao;


import models.Account;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Account {
    static Connection connection = ConnectMySQL.getConnection();



    public static List<Account> getAllAccount(){
        String listAccount= "Select * from account";
        List<Account> accounts = new ArrayList<>();
        try{
            Statement statementAccount = connection.createStatement();
            ResultSet resultSetAccount = statementAccount.executeQuery(listAccount);
            while (resultSetAccount.next()){

                int id = resultSetAccount.getInt("id");
                String username = resultSetAccount.getString("username");
                String password = resultSetAccount.getString("password");
                LocalDate birthday = resultSetAccount.getDate("birthday").toLocalDate();
                String address = resultSetAccount.getString("address");
                int role = resultSetAccount.getInt("id_role");
                accounts.add(new Account(id,username,password,address,birthday,role));

            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return accounts;
    }

    public static void saveAccount(Account account) {

        try {
            String listAccount = "INSERT INTO account ( username, password, address,birthday,id_role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatementAccount = connection.prepareStatement(listAccount);
            preparedStatementAccount.setString(1,account.getUsername());
            preparedStatementAccount.setString(2,account.getPassword());
            preparedStatementAccount.setString(3,account.getAddress());
            preparedStatementAccount.setDate(4, Date.valueOf(account.getBrithday()));
            preparedStatementAccount.setInt(5,account.getId_role());
            preparedStatementAccount.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}