package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class DataTestController {

    @GetMapping("/test")
    public Object test() throws SQLException, ClassNotFoundException {

        String driver= "dm.jdbc.driver.DmDriver";
        String url= "jdbc:dm://localhost:5236/TEST";
        String username="SYSDBA";
        String password="123456789";
        String userName="";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from apusic_test");
        int newID = 1;
        if (rs.next()) {
            userName = rs.getString("UserName");
            System.out.println("userName:" +userName);
        }else{
            System.out.println("no data");
        }
        rs.close();
        conn.close();




        return "hello apusic："+userName;
    }

}


