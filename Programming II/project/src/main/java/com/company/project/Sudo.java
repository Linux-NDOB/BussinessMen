package com.company.project;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Sudo{

    private Pojo gnu[];
    
    public Sudo(){

        int pillow = Integer.parseInt(JOptionPane.showInputDialog(
        "Please enter the vector length: "));

        gnu = new Pojo[pillow];

   
        int i, pos, id;
        String name;
        String gender;
        double basicSalary;
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




            basicSalary = Double.parseDouble(JOptionPane.showInputDialog(
            "Please enter the employee basic salary: ", 877000));


            
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
             "Please enter the Year of bonding "));


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
    
    public void pointTwo(){

        /* 2.Dado un ID Empleado el programa buscara su información en el vector
         y si existe mostrar sus datos y el valor neto a pagar de ese empleado.	
         
         */

    JOptionPane.showMessageDialog(null,"Now you will find a employee by id,"+"\n"
    +"show his data and the net value yo pay" );

     int i; int id;
     id =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the id to search"));
     
    
        //Overtime worked value
        double oValue =0;
       for ( i = 0; i < gnu.length; i++) {
          
            if (gnu[i].getId() == id) {
                 
                //Basic salary value
                double bSalary = gnu[i].getBasicSalary(); 

                //Contribution to health
                double pDisHealth = ((4*bSalary)/100);
                

                //Pension Contribution 
                double pPention = ((3.75*bSalary)/100); 
                

                //ARL contribution
                double pArl =  ((2*bSalary)/100); 
                

                //Year of bonding
                int dateBonding = gnu[i].getDateOfBonding();

                //Overtime worked
                int oWorked = gnu[i].getOvtermineWorked();

               
                
                //2020 is the current year
                int yWorked = ((dateBonding - 2020)*-1);

                //Conditionals for overtime value

                if(yWorked > 10)
                oValue =  45000;

                else if (yWorked > 5 && yWorked <=10)
                oValue =  350000;

                else if (yWorked > 3 && yWorked <=5)
                oValue =  300000;

                else if (yWorked >= 0 && yWorked <3)
                oValue =  250000;

                //Total value of overtime worked
                double twValue = oValue*oWorked;

                //Transportation subsidy value
                double sValue = 0;

                //Conditionals for stratum

                if (gnu[i].getStratum() == 1 ||gnu[i].getStratum() == 2 )
                sValue = 780000;

                else if (gnu[i].getStratum() > 2)
                sValue = 0;

                //net to pay 
                double  dP = (pDisHealth + pPention + pArl);
                double subSum = (bSalary -dP);
                double net = (subSum + twValue); 






     JOptionPane.showMessageDialog(null,
                                         "The entered id is: "+ gnu[i].getId() + "\n" +
                                          "Basic salary : " + gnu[i].getBasicSalary() + "\n" +
                                          "Overtime Worked : " + gnu[i].getOvtermineWorked() + "\n" +
                                          "Overtime Worked value: " + oValue + "\n" +
                                          "Value Overtime Worked : " + twValue + "\n" +
                                          "Contibution to heatlh(4%) : " + pDisHealth + "\n" +
                                          "Contibution to pention : " + pPention + "\n" +
                                          "Contibution to ARL : " + pArl + "\n" +
                                          "Total contribution : " + dP + "\n"+
                                          "Transportation subsidy : " + sValue + "\n"+
                                          "NET TO PAY : " + net
                
                                          ); 
    
     
            }return;
            
       }
 
 JOptionPane.showMessageDialog(null,"Id Not Registered");
}
        
    



    }


    
