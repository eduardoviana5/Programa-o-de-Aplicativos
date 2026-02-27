import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[3];
        double soma = 0;
        int contadorErro = 0;

        for (int i = 0; i < 3; i++) {

            while (true) {
                System.out.printf("Digite o %dº valor numérico: ", (i + 1));

                if (sc.hasNextDouble()) {
                    vetor[i] = sc.nextDouble();
                    soma += vetor[i];
                    break;
                } else {
                    System.out.printf("Valor inválido! Digite novamente.\n");
                    contadorErro++;
                    sc.next();
                }
            }
        }

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Quantidade de erros: %d\n", contadorErro);

        sc.close();
    }
}