package m1s04_atividade05;

import java.time.LocalDate;
import java.util.Scanner;

public class AppFrequenciaCardiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Ano de nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de nascimento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Dia de nascimento: ");
        int dia = scanner.nextInt();

        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, LocalDate.of(ano, mes, dia));

        System.out.println("\n--- INFORMAÇÕES ---");
        System.out.println("Nome completo: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência cardíaca máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência cardíaca alvo: " + pessoa.calcularFrequenciaAlvo());

        scanner.close();
    }
}