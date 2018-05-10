/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Login {
    
    public void show(){
        System.out.println("Welcome");
        System.out.println("Please Input your Password");
    }
    
    public String login(String password){
        
        return password;
    }
    
    public void showCont(String pass){
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        System.out.println("");
        Clients client = new Clients();
        client.show(val,pass);

        System.out.println("");
        
        System.out.println("Do you want to perform another transaction?");
        System.out.println("Yes to Continue and No to Quit");
        String ans = input.next();
        while(ans.equals("Yes")){
            Users.show(pass);
             val = input.nextInt();
             client.show(val,pass);
             System.out.println("");
             System.out.println("Do you want to perform another transaction?");
            System.out.println("Yes to Continue and No to Quit");
            ans = input.next();
        }
        
        System.out.println("Thank you for using our Service");
    }
}
