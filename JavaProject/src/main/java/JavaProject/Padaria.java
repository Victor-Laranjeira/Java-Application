package JavaProject;

import java.util.Random;

public class Padaria {
    private int comanda;
    private String produto;
    private int quantidade;
    private int i;
    
public Padaria() {
    this.produto = "Pão";
    this.quantidade = 5;
    this.comanda = 1;
    this.i = 0;
}

String produtoVetor[] = new String[10];
int quantidadeVetor[] = new int[10];
Random random = new Random();

public String produto() {
    produtoVetor[getI()] = getProduto();
    return produtoVetor[getI()];
}

public int quantidade(){
    quantidadeVetor[getI()] = getQuantidade();
    setI(getI() + 1);
    return quantidadeVetor[getI()];
}

public String comandaProduto() {
    for(i = 0; i < produtoVetor.length;i++) {
        if(produtoVetor[i] != null) {
            System.out.print(" " + produtoVetor[i] + ", ");
        }
    }
    return null; 
}

public String comandaQuantidade(){
    for(i = 0; i < quantidadeVetor.length; i++) {
        if(quantidadeVetor[i] != 0) {
            System.out.print(" " + quantidadeVetor[i] + ", ");
        }
    }
    return null;
}

public double precoRandom() {
    double preco = 0;
    for(int i = 0; i < quantidadeVetor.length; i++) {
        double valor = random.nextDouble() * 10;
        preco = preco + (quantidadeVetor[i] * valor);
    }
    System.out.println(preco + ", ");
    return 0;
}

@Override
public String toString() {
    return "Caixa{" + "Produtos comprados" + comandaProduto() + "valor final da compra, " + precoRandom() + "número da comanda: " + getComanda() + "}";
}

    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }  

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}