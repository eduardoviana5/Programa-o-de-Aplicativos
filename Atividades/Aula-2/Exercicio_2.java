import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[4];
        int somaPar = 0;

        for (int i = 0; i < 4; i++) {

            while (true) {
                System.out.printf("Digite o %dº número inteiro: ", (i + 1));

                if (sc.hasNextInt()) {
                    vetor[i] = sc.nextInt();

                    if (vetor[i] % 2 == 0) {
                        somaPar += vetor[i];
                    }
                    break;
                } else {
                    System.out.printf("Valor inválido! Digite um número inteiro.\n");
                    sc.next();
                }
            }
        }

        System.out.printf("Soma dos números pares: %d\n", somaPar);

        sc.close();
    }
}