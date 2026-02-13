import java.util.Scanner;
public class Atividade_12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char c;

        System.out.print("\nInforme um caractere: ");
        c = sc.next().charAt(0);

        System.out.printf("\nO caractere digitado foi: %c",c );
        
        sc.close();
    }
}
