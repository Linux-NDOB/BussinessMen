package com.company.project;

import javax.swing.JOptionPane;


public class Sudo{

    private Pojo gnu[];
    
    public Sudo(){

        int pillow = Integer.parseInt(JOptionPane.showInputDialog(
        "Please enter the vector length: "));

        gnu = new Pojo[pillow];

   
        int i, pos, id;
        String nomP;
        float costo;
        
        String name;
        String gender;
        float basicSalary;
        int stratum;
        int ovtermineWorked;
        int dateOfBonding;

        for(i=0; i<gnu.length; i++){

            gnu[i] = new Pojo(-1, "", "", -1, -1, -1, -1);

        }
       
        for(i=0; i<gnu.length; i++){

            do{
                id=Integer.parseInt(JOptionPane.showInputDialog(
                "Please enter the employee id: "));

                pos=getSearchId(id);

                if(pos>=0)

                    JOptionPane.showMessageDialog(null, 
                    "the entered employee id is used , please try again");

            }while(pos>=0);

            name = JOptionPane.showInputDialog("Please enter the employee name: ");



            Object tyGender[] = new Object[]{"M","F"};
    
            Object xGender = JOptionPane.showInputDialog(null,
            "Please choose the employee gender",
                                        "Gender Selection",
            JOptionPane.QUESTION_MESSAGE,null,tyGender ,tyGender[0]);
    
            gender = xGender.toString();




            basicSalary = Float.parseFloat(JOptionPane.showInputDialog(
            "Please enter the employee basic salary: "));


            
            String toParse;
            
           Object tyStratum[] = new Object[]{
               "1","2","3","4","5","6"};
   
           Object xStratum = JOptionPane.showInputDialog(null,
           "Please choose your stratum",
                                       "Stratum Selection",
           JOptionPane.QUESTION_MESSAGE,null,tyStratum ,tyStratum[0]);
   
            toParse = xStratum.toString();
        
            stratum=Integer.parseInt((String) toParse);
            
            
            ovtermineWorked = Integer.parseInt(JOptionPane.showInputDialog( null, 
            "Please enter the overtime worked number"));

            dateOfBonding = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Please enter the day of "));


            gnu[i].setId(id);
            gnu[i].setName(name);
            gnu[i].setGender(gender);
            gnu[i].setBasicSalary(basicSalary);
            gnu[i].setStratum(stratum);
            
            gnu[i].setOvtermineWorked(ovtermineWorked);
            gnu[i].setDateOfBonding(dateOfBonding);

            JOptionPane.showMessageDialog(null, 
            "Satisfactorily registered Employee im posistion : "+i+"!");
        }

       
    }

    int getSearchId(int id){
        int i;  
        for( i=0; i<gnu.length; i++){
            if(gnu[i].getId() == id)
                return i;
        }
        return -1;
    }
    


    
}