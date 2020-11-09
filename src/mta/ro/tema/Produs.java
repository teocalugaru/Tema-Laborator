package mta.ro.tema;

public class Produs {
    private String nume;
    private double pret;
    private int cantitate;

    public Produs(String nume,double pret,int cantitate){
        this.nume=nume;
        this.pret=pret;
        this.cantitate=cantitate;
    }
    @Override
    public String toString() {
        return "Produsul "+this.nume + " " + " costa " + this.pret+"lei "+" si exista "+this.cantitate+" exemplare";
    }
}