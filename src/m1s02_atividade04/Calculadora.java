package m1s02_atividade04;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale localeBr = Locale.of("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(localeBr);

        System.out.print("Por favor, digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (somar, subtrair, multiplicar, dividir): ");
        String operacao = scanner.next();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao.toLowerCase()) {
            case "somar":
                resultado = num1 + num2;
                break;
            case "subtrair":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: a divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: a operação é inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("O resultado é: %.2f%n", resultado);
        }

        scanner.close();
    }
}