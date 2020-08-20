package com.company.project;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public  class Tux {

        
        public static void main (String[] args){

        try{  


        int Option,Exit;
            
        Sudo main=null;
        
        do { 
            
        UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));  
        //rgb(0,150,136)
        //rgb(120,144,156)
        UIManager UI=new UIManager();
        UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
        UIManager.put("Panel.background",new ColorUIResource(120,144,156));
        
           
         
        Option=Integer.parseInt(JOptionPane.showInputDialog(
            
        "     ----------------Main Menu----------------\n"+"\n"+
                        
        "1. Create and Register an employee  \n"+"\n"+
                        
        "2. insert an employee id , show his data " +"\n"+
            "and the net worth payable of the employee.		\n"+"\n"+
                        
        "3. Generate a list ordering the employees"+ "\n" +
            "according to their net salary from highest to lowest .  \n"+"\n"+
                
        "4. Generate a list with the information of the employees, " +"\n"
            +"arranged alphabetically in ascending order by their names ." +  "\n"+"\n"+
                        
        "5. Generate a list with the information of the employees,"+"\n"
            + " ordered by stratum in descending order  \n"+"\n"+
                        
        "6. Exit.\n"+"\n"+
                
        " Please enter an option : "));
                
                    
        switch(Option){
        case 1:
                        
        try{
            
        main=new Sudo();
                            
        }catch(NegativeArraySizeException a){
                           
        JOptionPane.showMessageDialog(null, "DO NOT INSERT NEGATIVE NUMBERS "
                                     + "FOR THE ARRAY LENGHT");
                       
        }catch(NumberFormatException b){
                            
        JOptionPane.showMessageDialog(null, " DO NOT INSERT LETTERS,SIGNS \n"
                                      + " OR AN EXAGGERATED AMOUNT OF  \n"
                                      + " NUMBERS IN THE ARRAY PLEASE ");
        }catch(NullPointerException d){
                            
        d.printStackTrace();
                            
        JOptionPane.showMessageDialog(null, "please be logic ");
        }
                       
        break;
        
        case 2:
        if(main==null)
        JOptionPane.showMessageDialog(null, "Vector without data!");
        else{
        
            main.pointTwo();
        
        }
        break;
        case 3:
                        
        if(main==null)
        JOptionPane.showMessageDialog(null, "Vector without data!");
        else{
        try{
       
        } catch(NumberFormatException b){
        JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                           + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                           +" IN THE LICENSE PLATE PLEASE");
        }
        }
        break;
        case 4:
        if(main==null)
        JOptionPane.showMessageDialog(null, "Vector without data!");
        else{
        try{
       
        }catch(ArrayIndexOutOfBoundsException c){
        JOptionPane.showMessageDialog(null,"Please dont do it");
        }
        }
        break;
        
        case 5:
        if(main==null)
        JOptionPane.showMessageDialog(null, "Vector without data!");
        else{
        try{
       
        }catch(ArrayIndexOutOfBoundsException c){
        JOptionPane.showMessageDialog(null,"Please be logic");
        }
        }
        break;
                   
        case 6:
        Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
        if (Exit==0) {
           
         
        break;
                        }
        default:
                     
        JOptionPane.showMessageDialog(null, "Non valid option ");
                         
        break;
                
        }
                         
       
        }while (Option != 6);
        
        
        System.exit(0);
              
         
        } catch(NumberFormatException a){
            
        JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");
                          
                          
          }
         }
}
