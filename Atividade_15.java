import java.util.Scanner;
public class Atividade_15 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    

    String nome;
    float n1, n2;
    
    System.out.print("\nInforme seu nome: ");
    nome = sc.nextLine();
    System.out.print("\nInforme a nota da AV1 e da AV2: ");
    n1 = sc.nextFloat();
    n2 = sc.nextFloat();

    System.out.printf("\nNome do aluno: %s\nMedia: %.2f\n", nome, (n1 + n2) / 2);
    sc.close();
    }
}
