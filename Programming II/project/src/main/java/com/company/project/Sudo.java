package com.company.project;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Sudo{

    public Pojo gnu[];

    public int getSearchId(int id){
        int i;  
        for( i=0; i<gnu.length; i++){
            if(gnu[i].getId() == id)
                return i;
        }
        return -1;
    }
    
    public Sudo(){

        int pillow = Integer.parseInt(JOptionPane.showInputDialog(
        "Please enter the vector length: "));

        gnu = new Pojo[pillow];

   
        int i, pos, id;

        for(i=0; i<gnu.length; i++){

            gnu[i] = new Pojo(-1, "", "", -1, -1, -1, -1 ,-1);

        }

        String name;
        String gender;
        double basicSalary;
        int stratum;
        int ovtermineWorked;
        int dateOfBonding;

        
       
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

    public void getShowInformation(){
        int i;
        for(i=0; i<gnu.length; i++)
            gnu[i].getInfo();
        }

   
    
    public void pointTwo(){

    JOptionPane.showMessageDialog(null,"Now you will find a employee by id,"+"\n"
                                 +"show his data and the net value yo pay" );

     int id;

     id =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the id to search"));
     
    
        //Overtime worked value
        double oValue =0;

       for(int  i=0; i<gnu.length; i++) {
          
            if ( gnu[i].getId() == id) {
                 
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
                oValue =  35000;

                else if (yWorked > 3 && yWorked <=5)
                oValue =  30000;

                else if (yWorked >= 0 && yWorked <3)
                oValue =  25000;

                //Total value of overtime worked
                double twValue = oValue*oWorked;

                //Transportation subsidy value
                double sValue = 0;

                //Conditionals for stratum

                if (gnu[i].getStratum() == 1 ||gnu[i].getStratum() == 2 )
                sValue = 78000;

                else if (gnu[i].getStratum() > 2)
                sValue = 0;

                //net to pay 
                double  dP = (pDisHealth + pPention + pArl);
                double subSum = (bSalary -dP);
                double net = (subSum + twValue + sValue); 
                gnu[i].setNet(net);

    
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
    
            return;
            }
            JOptionPane.showMessageDialog(null, "Sorry id not found\n"
                + "id not registered");    
        }
       
    }
        
    
public void quickSort(int Begin, int End) {

    if(Begin>=End) return ;

    double pivote = gnu[Begin].getNet();

    int izq = Begin+1;
    int der = End;

    Pojo Tem=null;

    while(izq<=der) {   
    while(izq<=End && gnu[izq].getNet()> pivote) izq++;
    while(der>Begin && gnu[der].getNet()<=pivote) der--;
        
    if(izq<der)
    {

    Tem = new Pojo( 
    gnu[izq].getId(), 
    gnu[izq].getName(),
    gnu[izq].getGender(),
    gnu[izq].getBasicSalary(),
    gnu[izq].getStratum(),
    gnu[izq].getOvtermineWorked() , 
    gnu[izq].getDateOfBonding(), 
    gnu[izq].getNet() );
            
    gnu[izq].setId(gnu[der].getId());
    gnu[izq].setName(gnu[der].getName());
    gnu[izq].setGender(gnu[der].getGender());
    gnu[izq].setBasicSalary(gnu[der].getBasicSalary());
    gnu[izq].setStratum(gnu[der].getStratum());
    gnu[izq].setOvtermineWorked(gnu[der].getOvtermineWorked());
    gnu[izq].setDateOfBonding(gnu[der].getDateOfBonding());
    gnu[izq].setNet(gnu[der].getNet());
    
    gnu[der].setId(Tem.getId());
    gnu[der].setName(Tem.getName());
    gnu[der].setGender(Tem.getGender());
    gnu[der].setBasicSalary(Tem.getBasicSalary());
    gnu[der].setStratum(Tem.getStratum());
    gnu[der].setOvtermineWorked(Tem.getOvtermineWorked());
    gnu[der].setDateOfBonding(Tem.getDateOfBonding());
    gnu[der].setNet(Tem.getNet());
    
       }
    }
    
    if(der>Begin) {

    Tem = new Pojo( 
    gnu[Begin].getId(), 
    gnu[Begin].getName(),
    gnu[Begin].getGender(),
    gnu[Begin].getBasicSalary(),
    gnu[Begin].getStratum(),
    gnu[Begin].getOvtermineWorked(),
    gnu[Begin].getDateOfBonding(),
    gnu[Begin].getNet());
    
    gnu[Begin].setId(gnu[der].getId());
    gnu[Begin].setName(gnu[der].getName());
    gnu[Begin].setGender(gnu[der].getGender());
    gnu[Begin].setBasicSalary(gnu[der].getBasicSalary());
    gnu[Begin].setStratum(gnu[der].getStratum());
    gnu[Begin].setOvtermineWorked(gnu[der].getOvtermineWorked());
    gnu[Begin].setDateOfBonding(gnu[der].getDateOfBonding());
    gnu[Begin].setNet(gnu[der].getNet());
        
    gnu[der].setId(Tem.getId());
    gnu[der].setName(Tem.getName());
    gnu[der].setGender(Tem.getGender());
    gnu[der].setBasicSalary(Tem.getBasicSalary());
    gnu[der].setStratum(Tem.getStratum());
    gnu[der].setOvtermineWorked(Tem.getOvtermineWorked());
    gnu[der].setDateOfBonding(Tem.getDateOfBonding());
    gnu[der].setNet(Tem.getNet());

    }
    quickSort(Begin, der-1);
    quickSort(der+1, End);
    }

public void pointTree(){

JOptionPane.showMessageDialog(null, "Vector sorted by salary from major to minor");
   
}



    public int minorPosition(int Start){
        int i; 
        int posMenorID; 
        String minorValue; 
        posMenorID = Start;
        
        minorValue = gnu[Start].getName();
        
        for (i=Start+1; i<gnu.length; i++){
         
        if (gnu[i].getName().compareTo(minorValue)< 0){ 
         minorValue= gnu[i].getName(); 
         posMenorID = i;
            }
        }
       
        return posMenorID;
        }
    
        public void setSortSelection(){ 
        
        Pojo Tem=null;
        int i, posMenor;
        
        for (i=0; i<gnu.length; i++){
            
            posMenor = minorPosition(i);
        
            if(posMenor!=i){
                
                Tem = new Pojo( 
                gnu[i].getId(), 
                gnu[i].getName(),
                gnu[i].getGender(),
                gnu[i].getBasicSalary(),
                gnu[i].getStratum(),
                gnu[i].getOvtermineWorked() , 
                gnu[i].getDateOfBonding(), 
                gnu[i].getNet() 
                );
               
                gnu[i].setId(gnu[posMenor].getId());
                gnu[i].setName(gnu[posMenor].getName());
                gnu[i].setGender(gnu[posMenor].getGender());
                gnu[i].setBasicSalary(gnu[posMenor].getBasicSalary());
                gnu[i].setStratum(gnu[posMenor].getStratum());
                gnu[i].setOvtermineWorked(gnu[posMenor].getOvtermineWorked());
                gnu[i].setDateOfBonding(gnu[posMenor].getDateOfBonding());
                gnu[i].setNet(gnu[posMenor].getNet());
                
                gnu[posMenor].setId(Tem.getId());
                gnu[posMenor].setName(Tem.getName());
                gnu[posMenor].setGender(Tem.getGender());
                gnu[posMenor].setBasicSalary(Tem.getBasicSalary());
                gnu[posMenor].setStratum(Tem.getStratum());
                gnu[posMenor].setOvtermineWorked(Tem.getOvtermineWorked());
                gnu[posMenor].setDateOfBonding(Tem.getDateOfBonding());
                gnu[posMenor].setNet(Tem.getNet());
            }
        } 
        JOptionPane.showMessageDialog(null, "Vector sorted in  Asc order!");
        }

        public void shellSort( ){
            int salto, i;
            boolean Changes;

            Pojo Tem=null;

            for(salto=gnu.length/2; salto!=0; salto/=2){

            Changes=true;

            while(Changes){ 

            Changes=false;

            for(i=salto; i<gnu.length; i++) 

            if(gnu[i-salto].getStratum() < gnu[i].getStratum()){ 
           
            Tem = new Pojo( 
            gnu[i].getId(), 
            gnu[i].getName(),
            gnu[i].getGender(),
            gnu[i].getBasicSalary(),
            gnu[i].getStratum(),
            gnu[i].getOvtermineWorked() , 
            gnu[i].getDateOfBonding(), 
            gnu[i].getNet());
                        
            gnu[i].setId(gnu[i-salto].getId());
            gnu[i].setName(gnu[i-salto].getName());
            gnu[i].setGender(gnu[i-salto].getGender());
            gnu[i].setBasicSalary(gnu[i-salto].getBasicSalary());
            gnu[i].setStratum(gnu[i-salto].getStratum());
            gnu[i].setOvtermineWorked(gnu[i-salto].getOvtermineWorked());
            gnu[i].setDateOfBonding(gnu[i-salto].getDateOfBonding());
            gnu[i].setNet(gnu[i-salto].getNet());
                        
                        
            gnu[i-salto].setId(Tem.getId());
            gnu[i-salto].setName(Tem.getName());
            gnu[i-salto].setGender(Tem.getGender());
            gnu[i-salto].setBasicSalary(Tem.getBasicSalary());
            gnu[i-salto].setStratum(Tem.getStratum());
            gnu[i-salto].setOvtermineWorked(Tem.getId());
            gnu[i-salto].setDateOfBonding(Tem.getDateOfBonding());
            gnu[i-salto].setNet(Tem.getNet());
                        
            Changes=true; 
                         }
                      }
                  }
               }
            
}

    


    
