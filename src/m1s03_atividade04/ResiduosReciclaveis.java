package m1s03_atividade04;

import java.util.ArrayList;
import java.util.Scanner;

public class ResiduosReciclaveis {
    public static void main(String[] args) {
        ArrayList<String> categorias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de categorias de itens recicláveis (máximo 5 categorias)");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da categoria " + (i + 1) + ": ");
            String categoria = scanner.nextLine().trim();

            if (categorias.contains(categoria)) {
                System.out.println("Essa categoria já foi adicionada. Tente novamente.");
                i--;
            } else {
                categorias.add(categoria);
            }
        }

        System.out.println("\nCategorias de itens recicláveis cadastradas:");
        for (String categoria : categorias) {
            System.out.println("- " + categoria);
        }

        scanner.close();
    }
}