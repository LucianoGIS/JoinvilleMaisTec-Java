package m1s04_atividade03;

public class Animal {
    String nome;
    String habitat;
    String som;
    String tipoDeAlimentacao;

    public Animal(String nome, String habitat, String som, String tipoDeAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void mover() {
        System.out.println(nome + " está se movendo pelo habitat: " + habitat);
    }

    public void emitirSom() {
        System.out.println(nome + " faz o som: " + som);
    }

    public void alimentar() {
        if (tipoDeAlimentacao.equalsIgnoreCase("herbívoro")) {
            System.out.println(nome + " se alimenta de plantas.");
        } else if (tipoDeAlimentacao.equalsIgnoreCase("carnívoro")) {
            System.out.println(nome + " se alimenta de carne.");
        } else {
            System.out.println(nome + " tem um tipo de alimentação desconhecido.");
        }
    }

    public static void main(String[] args) {
        Animal leao = new Animal("Onça-pintada", "Floresta Tropical", "esturro", "carnívoro");
        leao.mover();
        leao.emitirSom();
        leao.alimentar();

        Animal vaca = new Animal("Vaca", "Fazenda", "Muuuuuuuuuuu", "herbívoro");
        vaca.mover();
        vaca.emitirSom();
        vaca.alimentar();
    }
}