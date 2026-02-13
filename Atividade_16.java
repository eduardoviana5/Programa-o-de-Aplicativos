import java.util.Scanner;
public class Atividade_16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String produto;
        float valor;
        int qtd;

        System.out.print("\nInforme o nome do produto: ");
        produto = sc.nextLine();
        System.out.print("\nInforme o valor do produto: ");
        valor = sc.nextFloat();
        System.out.print("\nInforme a quantidade: ");
        qtd = sc.nextInt();

        System.out.printf("\nProduto: %s\nTotal a pagar: %.2f\n", produto, valor*qtd);

        sc.close();
    }
}
