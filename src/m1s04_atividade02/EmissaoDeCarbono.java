package m1s04_atividade02;

import java.text.NumberFormat;
import java.util.Locale;

public class EmissaoDeCarbono {
    String atividade;
    double quantidadeEmissao;

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public double calcularEmissaoCO2(double minutos) {
        return (quantidadeEmissao / 60) * minutos;
    }

    public void exibirEmissao(double minutos) {
        double total = calcularEmissaoCO2(minutos);

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(1);
        nf.setMaximumFractionDigits(2);

        System.out.println("Atividade: " + atividade);
        System.out.println("Tempo: " + nf.format(minutos) + " minutos");
        System.out.println("Emissão de CO₂: " + nf.format(total) + " kg");
    }

    public static void main(String[] args) {
        EmissaoDeCarbono dirigir = new EmissaoDeCarbono("Dirigir um carro", 2.31);
        dirigir.exibirEmissao(90);

        EmissaoDeCarbono tv = new EmissaoDeCarbono("Assistir à TV", 0.1);
        tv.exibirEmissao(120);
    }
}