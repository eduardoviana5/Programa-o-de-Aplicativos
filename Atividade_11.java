import java.util.Scanner;
public class Atividade_11 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean n;

        System.out.print("\nInforme um valor booleano (true ou false): ");
        n = sc.nextBoolean();

        System.out.printf("\nO valor de bool é: %b", n);

        sc.close();
    }
}
