public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        this.comprimento = 1;
        this.largura = 1;
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = 3;
        this.largura = 4;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public void imprimirPerimetro() {
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public void imprimirArea() {
        System.out.println("Área: " + calcularArea());
    }
}
