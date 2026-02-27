import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String simbolo;

        while (true) {

            System.out.printf("Digite a operação (+, -, *, /, **) ou EXIT para sair: ");
            simbolo = sc.next();

            if (simbolo.equalsIgnoreCase("EXIT")) {
                System.out.printf("Programa encerrado.\n");
                break;
            }

            System.out.printf("Digite o primeiro valor: ");
            double valor1 = sc.nextDouble();

            System.out.printf("Digite o segundo valor: ");
            double valor2 = sc.nextDouble();

            switch (simbolo) {

                case "+":
                    System.out.printf("Resultado: %.2f\n", (valor1 + valor2));
                    break;

                case "-":
                    System.out.printf("Resultado: %.2f\n", (valor1 - valor2));
                    break;

                case "*":
                    System.out.printf("Resultado: %.2f\n", (valor1 * valor2));
                    break;

                case "/":
                    if (valor2 == 0) {
                        System.out.printf("Divisão não pode ser feita por zero.\n");
                    } else {
                        System.out.printf("Resultado: %.2f\n", (valor1 / valor2));
                    }
                    break;

                case "**":
                    System.out.printf("Resultado: %.2f\n", Math.pow(valor1, valor2));
                    break;

                default:
                    System.out.printf("Impossível realizar a operação.\n");
            }
        }

        sc.close();
    }
}