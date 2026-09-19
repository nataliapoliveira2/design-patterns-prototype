package app;

import model.Produto;
import model.Prototype;

public class Main {

    public static void main(String[] args) {
        
        Produto original = new Produto("Caderno", 12.50);

        Prototype copia = original.clone();

        ((Produto) copia).setPreco(20.00);
        
        System.out.println("Original: " + original);
        System.out.println("Copia: " + copia);

        

        
    }
}