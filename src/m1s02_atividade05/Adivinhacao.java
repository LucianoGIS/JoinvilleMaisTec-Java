package m1s02_atividade05;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int numeroUsuario = scanner.nextInt();

        int numeroGerado = random.nextInt(5) + 1;

        if (numeroUsuario == numeroGerado) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou, o número correto era " + numeroGerado);
        }

        scanner.close();
    }
}
