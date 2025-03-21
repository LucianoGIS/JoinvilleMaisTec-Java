package m1s02_atividade01;

import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        int quantidadeLetras = nomeCompleto.replace(" ", "").length();
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("Seu nome tem " + quantidadeLetras + " letras.");

        scanner.close();
    }
}