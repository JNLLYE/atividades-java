public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome +
                " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Kauan";
        p.idade = 19;

        p.apresentar();
    }
}
