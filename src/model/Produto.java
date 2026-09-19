package model;

public class Produto implements Prototype {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public Prototype clone () {
        return new Produto (this.nome, this.preco);

    }

    public String toString (){
        return "Produto: " + nome + " | Preço: " + preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}