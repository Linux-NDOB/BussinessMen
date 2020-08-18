package com.company.project;

public class Pojo {

    // Attributes ID EMPLEADO - NOMBRE - GENERO- SALARIO BASICO
    // - ESTRATO - HORAS EXTRA LABORADAS (H.E)-FECHA VINCULACION.

    private int id;

    private String name;

    private String gender;

    private float basicSalary;

    private int stratum;

    private int ovtermineWorked;

    private int dateOfBonding;

    public Pojo(int id, String name, String gender, float basicSalary, int stratum, int ovtermineWorked,
            int dateOfBonding) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.stratum = stratum;
        this.ovtermineWorked = ovtermineWorked;
        this.dateOfBonding = dateOfBonding;
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

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
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

    public int getDateOfBonding() {
        return dateOfBonding;
    }

    public void setDateOfBonding(int dateOfBonding) {
        this.dateOfBonding = dateOfBonding;
    }

    

}
