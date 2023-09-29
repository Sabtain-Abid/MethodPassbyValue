/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods.passvalue;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class MethodsPassvalue {

  
    public static int add(int a, int b)
    {
       return a + b; 
    }
    
    public static int sub(int a, int b)
    {
       return a - b; 
    }
    
      public static int mul(int a, int b)
    {
       return a * b; 
    }
    
    public static int div(int a, int b)
    {
        if(b == 0){
            return 0;
        }
        else
       return a / b; 
    }
    
    public void displayresult(int result)
    {
        System.out.println("Result is :-  " +result);
    }
    
      public static void main(String[] args) {

      MethodsPassvalue op = new MethodsPassvalue();
          int x=5 , y = 2 ;
          System.out.println("Enter the operator to perform operation");
         
          System.out.println("Enter the 1 to perform addition operation:- ");
          
          System.out.println("Enter the 2 to perform subtration operation:- ");
          
          System.out.println("Enter the 3 to perform Multiplication operation:- ");
          
          System.out.println("Enter the 4 to perform division operation:- ");
        int z = 0;
        Scanner ch = new Scanner(System.in);
        int choice =ch.nextInt();
        switch(choice)          //Choose one operator to perform operation 
        {
            case 1:
            
                z=op.add(x,y);
            op.displayresult(z);
                break;
        
            case 2:
             
                z=op.sub(x,y);
            op.displayresult(z);
                break;
        
          
            case 3:
            
                z=op.mul(x,y);
            op.displayresult(z);
                break;
       
           
            case 4:
            
            z=op.div(x ,y);
            op.displayresult(z);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        }}

