package mta.ro.tema;

import java.util.ArrayList;
import java.util.Collections;

public class Magazin {
    private ArrayList<Produs> produse;
    private ArrayList<Angajat> angajati;
    public Magazin(){
        produse=new ArrayList<>();
    }
    public void addProduct(Produs p)
    {
        produse.add(p);
    }
    public void removeProduct(Produs p)
    {
        produse.remove(p);
    }
    public void addAngajat(Angajat a)
    {
        angajati.add(a);
    }
    public void removeAngajat(Angajat a)
    {
        angajati.remove(a);
    }
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
