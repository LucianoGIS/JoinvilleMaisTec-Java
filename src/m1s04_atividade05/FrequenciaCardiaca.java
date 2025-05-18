package m1s04_atividade05;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }

    public String calcularFrequenciaAlvo() {
        int maxima = calcularFrequenciaMaxima();
        double min = maxima * 0.50;
        double max = maxima * 0.85;
        return String.format("%.0f - %.0f bpm", min, max);
    }
}