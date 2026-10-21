public class Aluno {
    String nome;
    int idade;
    double nota;

    void verificarSituacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.nome = "Kauan";
        a.idade = 20;
        a.nota = 8.0;

        a.verificarSituacao();
    }
}
