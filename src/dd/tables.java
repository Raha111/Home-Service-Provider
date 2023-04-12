/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dd;

import javax.swing.JOptionPane;

/**
 *
 * @author rubai
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),password varchar(200),mobileNumber varchar(10),address varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,password,mobileNumber,address,status) values('Admin','admin@gmail.com','admin','01863557238','Dhaka','true')";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
