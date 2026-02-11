import java.util.Scanner;
public class Atividade_7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float produto;
        int qtd;

        System.out.printf("Informe o valor do produto: ");
        produto = sc.nextFloat();

        System.out.printf("Informe a quantidade de produto comprado: ");
        qtd = sc.nextInt();

        System.out.printf("Valor total da compra: %.2f ", produto * qtd);
    }
}