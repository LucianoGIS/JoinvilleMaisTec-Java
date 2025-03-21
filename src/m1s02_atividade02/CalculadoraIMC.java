package m1s02_atividade02;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(localeBr);

        System.out.print("Digite sua altura (ex: 1,70): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}
