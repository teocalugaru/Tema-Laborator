package mta.ro.tema;

import java.util.ArrayList;

public class Magazin {
    private ArrayList<Produs> produse;
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
