package com.company;
import java.sql.*;

public class Driver {
    public static void main(String[] args) {

        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Soft_data","root", "Therealg1@#");
            Statement myState = myConn.createStatement();
            ResultSet myRs = myState.executeQuery("select * from employee");
            while (myRs.next()) {
                System.out.println(myRs.getString("lname") + "," + myRs.getString("fname")+ "," + myRs.getString("email"));
            }


        }
        catch(Exception exc){
            exc.printStackTrace();



        }



    }
}