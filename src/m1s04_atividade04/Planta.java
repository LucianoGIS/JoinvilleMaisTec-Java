package m1s04_atividade04;

import java.text.NumberFormat;
import java.util.Locale;

public class Planta {
    String nome;
    String tipo;
    double necessidadeDeAgua;

    public Planta(String nome, String tipo, double necessidadeDeAgua) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }

    public void calcularNecessidadeDeAgua(int qtdSemanas, double area) {
        double total = necessidadeDeAgua * area * qtdSemanas;

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(1);

        System.out.println("A planta " + nome + " precisa de " + nf.format(total) + " litros de água em " + qtdSemanas + " semanas.");
    }

    public void irrigar() {
        System.out.println("A planta " + nome + " foi irrigada com sucesso!");
    }

    public static void main(String[] args) {
        Planta alface = new Planta("Alface", "horta", 5.0);
        alface.calcularNecessidadeDeAgua(4, 10); // 4 semanas, 10 m²
        alface.irrigar();

        Planta laranjeira = new Planta("Laranjeira", "frutífera", 12.5);
        laranjeira.calcularNecessidadeDeAgua(3, 15); // 3 semanas, 15 m²
        laranjeira.irrigar();
    }
}