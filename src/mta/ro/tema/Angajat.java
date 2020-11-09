package mta.ro.tema;

public class Angajat {


    private String nume;
    private double salariu;
    private int an_angajare;


    Angajat(String nume,double salariu, int an_angajare){
        this.nume=nume;
        this.salariu=salariu;
        this.an_angajare=an_angajare;
    }


    @Override
    public String toString() {
        return "Angajatul cu numele "+ this.nume+", angajat in anul "+this.an_angajare+" are salariul de "+this.salariu;
    }

}
