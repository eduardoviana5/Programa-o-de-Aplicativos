import java.util.Scanner;
public class Atividade_8{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.printf("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.printf("Seja Bem Vindo, %s", nome);

        sc.close();
    }
}
