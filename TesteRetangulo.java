public class TesteRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();

        Retangulo retangulo2 = new Retangulo(3, 4);

        System.out.println("Retângulo 1:");
        retangulo1.imprimirPerimetro();
        retangulo1.imprimirArea();

        System.out.println("Retângulo 2:");
        retangulo2.imprimirPerimetro();
        retangulo2.imprimirArea();
    }
}
