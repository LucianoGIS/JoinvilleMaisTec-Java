package m1s03_atividade06;

import java.util.ArrayList;
import java.util.Scanner;

public class RoteiroTrilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> paradas = new ArrayList<>();

        while (true) {
            System.out.println("Você deseja adicionar uma nova parada? (sim/não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("não")) {
                break;
            }

            System.out.println("Informe o nome da parada:");
            String nomeParada = scanner.nextLine();

            System.out.println("Informe a posição onde deseja adicionar a parada, sendo 1 para início, 2 para a segunda posição e assim por diante ou 'fim' para adicionar o final:");
            String posicao = scanner.nextLine();

            if (posicao.equalsIgnoreCase("fim")) {
                paradas.add(nomeParada);
            } else {
                try {
                    int index = Integer.parseInt(posicao) - 1;
                    if (index >= 0 && index <= paradas.size()) {
                        paradas.add(index, nomeParada);
                    } else {
                        System.out.println("Posição inválida! A parada será adicionada no final.");
                        paradas.add(nomeParada);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! A parada será adicionada no final.");
                    paradas.add(nomeParada);
                }
            }
        }

        System.out.println("\nItinerário completo da trilha:");
        for (int i = 0; i < paradas.size(); i++) {
            System.out.println((i + 1) + ". " + paradas.get(i));
        }

        scanner.close();
    }
}