package mta.ro.tema;

public class Main {
    public static void main(String[] args) {
        Produs P = new Produs("creion", 5.5, 50);
      //  System.out.println(P);
        Magazin M = new Magazin();
        M.addProduct(P);
        M.addProduct(new Produs("pix", 3.2, 80));
        System.out.println(M);
    }
}
