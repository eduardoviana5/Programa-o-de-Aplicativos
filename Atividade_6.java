import java.util.Scanner;
public class Atividade_6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float n1, n2;

        System.out.printf("Informe um numero real: ");
        n1= sc.nextFloat();

        System.out.printf("Informe um numero real: ");
        n2 = sc.nextFloat();

        System.out.printf("A media entre os numeros reais é: %f", (n1 + n2) / 2);

    }
}