package m1s02_atividade02;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(localeBr);

        System.out.print("Por favor, digite a sua altura (ex: 1,70): ");
        double altura = scanner.nextDouble();

        System.out.print("Agora, digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}
