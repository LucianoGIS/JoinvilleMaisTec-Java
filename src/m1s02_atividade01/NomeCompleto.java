package m1s02_atividade01;

import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Agora, digite o seu nome: ");
        String nome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        int quantidadeLetras = nomeCompleto.replace(" ", "").length();
        System.out.println("O seu nome completo é: " + nomeCompleto);
        System.out.println("O seu nome tem " + quantidadeLetras + " letras.");

        scanner.close();
    }
}