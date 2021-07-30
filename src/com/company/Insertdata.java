package com.company;
import java.sql.*;
//IMPORT JAVA FILE

public class Insertdata {
    public static void main (String []args){

        String url = "jdbc:mysql://127.0.0.1:3306/Soft_data"; //ESTANLISH CONNECTION
        String user = "root";
        String password = "Therealg1@#";

        try{
            Connection myconn = DriverManager.getConnection(url,user,password);
            Statement mystmt = myconn.createStatement();
            String sql = "insert into employee"+"(fname,lname,email)" +"values('nira','hello','myname@gmail.com')"; //QUERY
            mystmt.executeUpdate(sql);
            System.out.println("insert complete");

        }
       catch (Exception e){
            e.printStackTrace();
       }



    }


}
