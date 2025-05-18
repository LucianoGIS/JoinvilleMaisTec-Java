package m1s04_atividade01;

class Arvore {
    String nome;
    String tipo;
    double altura;

    public Arvore(String nome, String tipo, double altura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " metros");
    }

    public double calcularOxigenio() {
        return altura * 10;
    }

    public static void main(String[] args) {
        Arvore arvore = new Arvore("Ipê", "Arbustiva", 5.5);
        arvore.exibirInformacoes();
        System.out.println("Oxigênio produzido: " + arvore.calcularOxigenio() + " gramas por dia");
    }
}