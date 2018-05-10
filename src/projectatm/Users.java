/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class Users {
    
    static Map nmap = new HashMap();
    static Map map = new HashMap();
    
    
    public Users(){
        
        map.put("1022", "Ope");
        map.put("1023", "Tunde");
        map.put("1024", "Kolade");
        map.put("1025", "Bisi");
        map.put("1026", "Kayode");
        map.put("1027", "Tope");
        map.put("1028", "Pelumi");
        
        Users.nmap.put("1022", "23000");
        Users.nmap.put("1023", "19000");
        Users.nmap.put("1024", "18000");
        Users.nmap.put("1025", "21000");
        Users.nmap.put("1026", "18500");
        Users.nmap.put("1027", "19200");
        Users.nmap.put("1028", "18500");
    }
    
    public static void show(String s){
        String validate = valid(s);
        String name = validate.split(" ")[0];
        if(!validate.equals("Null")){
            System.out.println("Welcome "+name); 
            System.out.println("What do you want to do?");
            System.out.println("Please choose from the following options");
            System.out.println("1 Check your account Balance");
            System.out.println("2 Withdraw");
            System.out.println("3 Transfer Money");
            System.out.println("4 Fund your account");
        }
        else{
            System.out.println("Invalid PassWord");
            System.exit(0);
        }
    }
    
    public static String showBalance(String s){
        //String[] balance = valid(s).split(" ");
        //return balance[1];
        String bal = nmap.get(s).toString();
        return bal;
    }
    
    public static String ValidateName(String name){
        
        for(Object k : map.keySet()){
            String h = map.get(k).toString();
            if (name.equals(h)){
                String details = k.toString() + " " + h;
                return details;
            }
        }
        return "Null";
    }
    
    public static String valid(String st){
        
        for(Object k: map.keySet()){
            if(st.equals(k)){
                String y = map.get(k).toString();
                String z = y + " " +Users.nmap.get(k).toString();
                return z;
            }
        }
        return "Null";
    }
    
}
