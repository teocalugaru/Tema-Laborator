package mta.ro.tema;

import java.util.ArrayList;

public class Magazin {
    private ArrayList<Produs> produse;
    private ArrayList<Angajat> angajati;
    public Magazin(){
        produse=new ArrayList<>();angajati=new ArrayList<>();
    }
    public void addProduct(Produs p)
    {
        produse.add(p);
    }
    public void addAngajat(Angajat a){angajati.add(a);}
    public void removeProduct(Produs p)
    {
        produse.remove(p);
    }
    public void removeAngajat(Angajat a){angajati.add(a);}
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Magazinul contine:\n");
        for(Produs p : produse)
        {
            builder.append(p.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
