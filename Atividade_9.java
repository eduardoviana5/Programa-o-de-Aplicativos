import java.util.Scanner;
public class Atividade_9 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome;
        String cidade;

        System.out.print("\nInforme o seu nome: ");
        nome = sc.nextLine();

        System.out.print("\nInforme a sua cidade: ");
        cidade = sc.nextLine();

        System.out.printf("\n%s é aluno do SENAI e mora na cidade de %s\n",nome ,cidade);

        sc.close();
    }
}
