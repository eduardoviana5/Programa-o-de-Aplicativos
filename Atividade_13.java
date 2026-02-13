import java.util.Scanner;
public class Atividade_13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char nome;

        System.out.print("\nInforme um nome: ");
        nome = sc.next().charAt(0);

        System.out.printf("\nA letra inicial do nome %c é ", nome);

        sc.close();
    }
}
