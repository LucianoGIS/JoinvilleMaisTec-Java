package m1s03_atividade02;

import java.text.Normalizer;
import java.util.Scanner;

public class EspeciePerigo {
    public static void main(String[] args) {
        String[] especiesAmeacadas = {"Papagaio-verdadeiro", "Lobo-guará", "Tamanduá-bandeira", "Mico-leão-dourado", "Onça-pintada"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da espécie para verificar se está em risco de extinção: ");
        String especieUsuario = normalizarTexto(scanner.nextLine());

        boolean encontrada = false;
        for (String especie : especiesAmeacadas) {
            if (normalizarTexto(especie).equalsIgnoreCase(especieUsuario)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("A espécie " + especieUsuario + " está em risco de extinção!");
        } else {
            System.out.println("A espécie " + especieUsuario + " não está na lista de risco de extinção.");
        }

        scanner.close();
    }

    // Método para remover acentos e substituir hifens por espaços para coincidir com dados de entrada do usuário
    private static String normalizarTexto(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        texto = texto.replaceAll("[-]", " ").trim();
        return texto.toLowerCase();
    }
}