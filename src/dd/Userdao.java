/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dd;
import model.User;
/**
 *
 * @author rubai
 */
public class Userdao {
    public static void save(User user){
        String query = "insert into user(name,email,password,mobileNumber,address,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!!!");
    }
}
