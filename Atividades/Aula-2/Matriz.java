import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores inteiros para a matriz 3x3:");

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                while (true) {
                    System.out.printf("Posição [%d][%d]: ", i, j);

                    if (sc.hasNextInt()) {
                        matriz[i][j] = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Valor inválido! Digite apenas números inteiros.");
                        sc.next(); 
                    }
                }
            }
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }

        System.out.println("\n\nDiagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", matriz[i][2 - i]);
        }

        System.out.println("\n\nValores acima da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i) {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }

        System.out.println("\n\nValores abaixo da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > j) {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }

        sc.close();
    }
}
