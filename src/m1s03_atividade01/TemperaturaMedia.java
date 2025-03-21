package m1s03_atividade01;

import java.text.DecimalFormat;

public class TemperaturaMedia {
    public static void main(String[] args) {
        double[] temperaturas = {25.5, 27.3, 26.8, 24.7, 23.9, 25.2, 26.1};

        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Temperaturas registradas na semana:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i+1) + ": " + df.format(temperaturas[i]) + "°C");
        }

        System.out.println("\nTemperatura média da semana: " + df.format(media) + "°C");
    }
}