/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ProjectATM {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here

        Login l = new Login();
        l.show();
        Scanner input = new Scanner(System.in);
        String pass = input.next();
        String password = l.login(pass);
        
        System.out.println("");
        Users user = new Users(); 
        //user.show(password);
        Users.show(password);
        
        l.showCont(password);
    }
   
}
