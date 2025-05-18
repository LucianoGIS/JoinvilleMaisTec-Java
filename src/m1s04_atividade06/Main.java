package m1s04_atividade06;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Data de nascimento (dd/mm/yyyy): ");
        String dataStr = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento;

        try {
            dataNascimento = LocalDate.parse(dataStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida!");
            sc.close();
            return;
        }

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        // Formatador de números com vírgula
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));

        System.out.println("\n--- Perfil de Saúde ---");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Sobrenome: " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de nascimento: " + perfil.getDataNascimento().format(formatter));
        System.out.println("Altura: " + nf.format(perfil.getAltura()) + " m");
        System.out.println("Peso: " + nf.format(perfil.getPeso()) + " kg");
        System.out.println("Idade: " + perfil.calcularIdade() + " anos");
        System.out.println("IMC: " + nf.format(perfil.calcularIMC()));
        System.out.println("Frequência cardíaca máxima: " + perfil.frequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência cardíaca alvo: " + perfil.frequenciaCardiacaAlvo() + " bpm");

        sc.close();
    }
}