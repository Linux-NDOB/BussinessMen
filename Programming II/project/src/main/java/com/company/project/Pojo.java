package com.company.project;

import javax.swing.JOptionPane;

public class Pojo {

    // Attributes:  ID EMPLEADO - NOMBRE - GENERO- SALARIO BASICO
    // - ESTRATO - HORAS EXTRA LABORADAS (H.E)-FECHA VINCULACION.

    private int id;

    private String name;

    private String gender;

    private double basicSalary;

    private int stratum;

    private int ovtermineWorked;

    private double net;

    private int day;
    
    private int month;

    private int year;


    public Pojo( int id, int day, int month, int year,
                 String name, String gender, 
                 double basicSalary, 
                 int stratum, int ovtermineWorked
                 , double net) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.stratum = stratum;
        this.ovtermineWorked = ovtermineWorked;
        this.day = day;
        this.month = month;
        this.year = year;
        this.net = net;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getStratum() {
        return stratum;
    }

    public void setStratum(int stratum) {
        this.stratum = stratum;
    }

    public int getOvtermineWorked() {
        return ovtermineWorked;
    }

    public void setOvtermineWorked(int ovtermineWorked) {
        this.ovtermineWorked = ovtermineWorked;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public void getInfo(){

        String dat="";
        dat+="The Employee information is:\n";
        dat+="Id: "+id+"\n";
        dat+="Name: "+name+"\n";
        dat+="Gender: "+gender +"\n";
        dat+="BasicSalary: " + basicSalary +"\n";
        dat+="Stratum: "+stratum + "\n";
        dat+="Overtime worked: "+ovtermineWorked +"\n";
        dat+="Date of bonding: "+ "\n";
        dat+="Day: "+ day +"\n";
        dat+="Month: "+ month +"\n";
        dat+="Year: "+ year +"\n";
        dat+="Net: "+net +"\n";
       
        
       
        JOptionPane.showMessageDialog(null, dat);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

