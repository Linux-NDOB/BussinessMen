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
    
    public void pointTwo(){

        /* 2.Dado un ID Empleado el programa buscara su información en el vector
         y si existe mostrar sus datos y el valor neto a pagar de ese empleado.	
         
         */

    JOptionPane.showMessageDialog(null,"Now you will find a employee by id,"+"\n"
    +"show his data and the net value yo pay" );

     int i; int id;
     id =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the id to search"));
     
       for (i = 0; i < gnu.length; i ++) {
          
            if (gnu[i].getId() == id) {
     
     
     JOptionPane.showMessageDialog(null, "The entered id is: "+ gnu[i].getId() + "\n" +
                                          "Basic salary : " + gnu[i].getBasicSalary() + "\n" +
                                          "Overtime Worked : " + gnu[i].getOvtermineWorked() + "\n" +
                                          ""
                                          ); 
    
     
            }return;
            
       }
 
 JOptionPane.showMessageDialog(null,"Codigo no registrado");
}
        

        






        /*
        El neto a pagar de cada empleado es calculado bajo las siguientes condiciones:

Se debe descontar 4% del salario básico para aportes a salud, 3,75% para aportes a pensión y 2% para ARL.
Se debe sumar en el neto a pagar el devengado por horas extra que se obtiene de la cantidad laborada por el valor de las H.E
La hora extra tendrá un valor de $45.000 si el empleado tiene más de 10 años en la empresa, de $35.000 si tiene entre 10 y 5 años, de $ 30.000 si tiene entre 5 y 3 años y de $ 25.000 si tiene menos de 3 años.
Los empleados de ESTRATO 1 y 2 tienen un subsidio de transporte equivalente a $78.000.

Al finalizar se debe arrojar el detallado de nómina para el empleado donde especifica sus ganancias, descuentos y el neto a pagar así:


SUELDO BASICO			xxxxx
H.E LABORADAS			xxxxx	
VALOR H.E				xxxxx
TOTAL H.E				xxxxx
APORTE SALUD			xxxxx
APORTE PENSION			xxxxx
APORTE ARL				xxxxx	
SUBSIDIO TTE				xxxxx
*/



    }


    
