package JavaProject;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String produto;
        int quantidade;
        int cont = 0;
        Padaria padaria = new Padaria();
        do{
            System.out.println("---------------Menu da padaria da boa a��o---------------");
            System.out.println("Digite respectivamente o que voc� gostaria de comprar e a quantidade: ");
            produto = input.next();
            quantidade = input.nextInt();
            cont++;
            padaria.setProduto(produto);
            padaria.setQuantidade(quantidade);
            padaria.produto();
            padaria.quantidade();
        }while(cont != 3);
        padaria.toString();
    }
}
