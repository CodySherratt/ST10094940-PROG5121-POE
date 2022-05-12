
package com.mycompany.registration;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JFrame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

        
public class Registration {

Scanner sc = new Scanner(System.in);
   public static final int PASSWORD_LENGTH = 8;
    
    // code attribution
    // method taken from techdive.in
    // http://techdive.in/java/java-password-validation
    //arunraj
    //http://techdive.in/users/arunraj
    
   
   
    // code attribution
    // method taken from VCLEARN
    // https://myvc.iielearn.ac.za/ultra/courses/_138945_1/cl/outline
    // Fatima
   
   
   
   
   
    // code attribution
    // method taken from Course Hero
    // https://www.coursehero.com/file/146096621/2/
    //SargentEmuMaster319
    //https://www.coursehero.com/profile/SargentEmuMaster319/
   
   
   
    // code attribution
    // method taken from stack overflow
    //https://stackoverflow.com/questions/46199788/java-while-loop-for-entering-username-and-password-3-times-issue-with-break-s
    //Carcigenicate
    // https://stackoverflow.com/users/3000206/carcigenicate
   
   
   
    // code attribution 
    // method taken from youtube
    // Erron Bartolo
    // https://www.youtube.com/channel/UC-iDJA6iX_okcW7HemqJlvg
   
   
   
   
    public static void main(String[] args) {
       
       
       
       String Firstname;
       String Secondname;
       String Username;
       String Password;
       String usernameLogin;
       String passwordLogin;
       String invalidPassword;
       
       Scanner sc = new Scanner(System.in);
       JFrame frame = new JFrame();
       
       int attempts = 0;
       
       
       Firstname =  JOptionPane.showInputDialog("Please Enter your First name:");
       Secondname = JOptionPane.showInputDialog("Please Enter your Second name:");
       Username =  JOptionPane.showInputDialog("Enter your  Username");
       Password = JOptionPane.showInputDialog("Enter your password");
        
       if (is_Valid_Password(Password)) {
            JOptionPane.showMessageDialog(frame,"Password successfully captured " + Password);
        } else {
            JOptionPane.showMessageDialog(frame,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character " );
            System.exit(0);
        }
       
        usernameLogin =JOptionPane.showInputDialog("Please enter your registered username");
        if(usernameLogin == Username){
             
        }
        passwordLogin =JOptionPane.showInputDialog("Please enter your registered password");
            if (Password == Password){
                JOptionPane.showMessageDialog(null,"Welcome "+Firstname+" "+Secondname+", it is great to see you again" );
            }
        else {
            
            invalidPassword = JOptionPane.showInputDialog("Username or password incorrect, please try again" );
            System.exit(0);
        }
       
        
        
        
        
       
    } // code attribution
      // this method was taken from w3resource
      // https://www.w3resource.com/java-exercises/method/java-method-exercise-11.php
      //anonymous
    
    
        public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int specialCount =0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
         return (charCount >= 2 && numCount >= 1 );      
    }
        public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
        public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
        
      public class loginSuccessfull {
      
      String returnMessage= "True";
      
      
      public String getMessage()
   {
      return returnMessage;
   }
      
      }  
       
}


