package m1s03_atividade03;

import java.util.Scanner;

public class QualidadeAr {
    public static void main(String[] args) {
        String[] cidades = {"Joinville", "Aracaju", "Porto da Folha", "Curitiba", "Recife"};
        int[] indicesQualidade = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Por favor, digite o índice de qualidade do ar para " + cidades[i] + ": ");
            indicesQualidade[i] = scanner.nextInt();
        }

        System.out.println("Cidades com índice de qualidade do ar acima do limite seguro estipulado (100):");
        boolean encontrou = false;

        for (int i = 0; i < cidades.length; i++) {
            if (indicesQualidade[i] > 100) {
                System.out.println(cidades[i] + " - Índice: " + indicesQualidade[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma cidade está com índice acima do limite seguro.");
        }

        scanner.close();
    }
}