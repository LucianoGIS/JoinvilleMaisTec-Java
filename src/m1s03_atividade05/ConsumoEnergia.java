package m1s03_atividade05;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> consumoMensal = new ArrayList<>();
        final double LIMITE_SUSTENTAVEL = 200.0;

        System.out.print("Quantos meses de consumo deseja informar?");
        int meses = scanner.nextInt();

        for (int i = 1; i <= meses; i++) {
            System.out.printf("Digite o consumo do mês %d (em kWh): ", i);
            double consumo = scanner.nextDouble();
            consumoMensal.add(consumo);
        }

        double soma = 0;
        for (double consumo : consumoMensal) {
            soma += consumo;
        }

        double mediaConsumo = soma / consumoMensal.size();

        System.out.printf("O consumo médio de energia é: %.2f kWh/mês%n", mediaConsumo);

        if (mediaConsumo > LIMITE_SUSTENTAVEL) {
            System.out.println("Atenção! O consumo está acima do limite sustentável.");
        } else {
            System.out.println("O consumo está dentro do limite sustentável.");
        }

        scanner.close();
    }
}
