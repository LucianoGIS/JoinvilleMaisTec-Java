package m1s02_atividade06;

import java.util.Scanner;

public class CalculadoraPA_PG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite a raiz: ");
        int raiz = scanner.nextInt();

        System.out.print("Deseja calcular P.A. ou P.G.? (Digite 'PA' ou 'PG'): ");
        String escolha = scanner.next().toUpperCase();

        System.out.println("Os 10 primeiros termos são:");

        if (escolha.equals("PA")) {
            for (int i = 0; i < 10; i++) {
                System.out.print(valorInicial + (i * raiz) + " ");
            }
        } else if (escolha.equals("PG")) {
            for (int i = 0; i < 10; i++) {
                System.out.print((int) (valorInicial * Math.pow(raiz, i)) + " ");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
