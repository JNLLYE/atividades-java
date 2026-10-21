public class Produto {
    String nome;
    double preco;
    int quantidade;

    void calcularTotal() {
        double total = preco * quantidade;

        System.out.println("Produto: " + nome);
        System.out.println("Total da compra: R$ " + total);
    }

    public static void main(String[] args) {
        Produto p = new Produto();

        p.nome = "Mouse";
        p.preco = 50.00;
        p.quantidade = 3;

        p.calcularTotal();
    }
}
