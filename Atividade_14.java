import java.util.Scanner;
public class Atividade_14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        float altura;

        System.out.print("\nInforme o seu nome: ");
        nome = sc.nextLine();
        System.out.print("\nInforme a sua idade: ");
        idade = sc.nextInt();
        System.out.print("\nInforme a sua altura: ");
        altura = sc.nextFloat();

        System.out.printf("\nNome: %s\nIdade: %d\nAltura: %.2f\n",nome,idade,altura);

        sc.close();
    }
}
