public class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro c = new Carro();

        c.marca = "Toyota";
        c.modelo = "Corolla";
        c.ano = 2022;

        c.exibirDados();
    }
}
