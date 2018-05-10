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
public class Clients{
    
    public void show(int x, String pas){
        switch(x){
        case 1:
            balance(pas);
            break;
        case 2:
            withdraw(pas);
            break;
        case 3:
            transfer(pas);
            break;
        case 4:
            deposit(pas);
            break;
        default:
            System.out.println("Invalid Transaction");
             break;
        }
                
    }
    
    public void balance(String pas){
        System.out.println("Your account balance is ");
       // Users user1 = new Users();
        String bal = Users.showBalance(pas);
        System.out.println(bal);
    }
    
    public void transfer(String pas){
        System.out.println("What is the name of the Reciever?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String username = Users.ValidateName(name);
        if (!username.equals("Null")){
            String []name1 = username.split(" ");
            System.out.println("You are about to transfer money to "+name1[1]);
            System.out.println("How much do you want to transfer?");
            int y = input.nextInt();
            int x = y + Integer.parseInt(name1[0]);
            String bal = Users.nmap.get(pas).toString();
            if(Integer.parseInt(bal) >= y){
                int z = Integer.parseInt(bal) - y;
                Users.nmap.put(pas, Integer.toString(z));
                System.out.println("Transaction Successful");
            }else{
                System.out.println("Insufficient Fund");
            }
            
        }else{
            System.out.println("Name not Found!");
        }
    }
    public void withdraw(String pas){
        System.out.println("How much will you like to withdraw?");
        Scanner input1 = new Scanner(System.in);
        int amount = input1.nextInt();
            
       // Users user1 = new Users();
        String balance = Users.showBalance(pas);
        int bal = Integer.parseInt(balance);
        if(bal > amount){
            int newbal = bal - amount;
            Users.nmap.put(pas,Integer.toString(newbal));
            System.out.println("Transaction Successful \n Your new Account Balance is");
            String st = Users.nmap.get(pas).toString();
            System.out.println(st);
            //System.out.println(newbal);
        }
        else{
            System.out.println("Insufficient Fund");
        }
    }
    public void deposit(String pas){
        Scanner input = new Scanner(System.in);
        System.out.println("How much are you depositing?");
        int dep = input.nextInt();
       String amt =  Users.nmap.get(pas).toString();
       int amount = Integer.parseInt(amt) + dep;
       Users.nmap.put(pas, Integer.toString(amount));
        System.out.println("Your new account balance is \n");
        System.out.println(amount);
    }
    
    
}
