
package testeobj;


public class Pessoa {
    
    
    
    private String nome;
    private int idade;
    private String profissao;

    // Construtor da classe
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Método para exibir os detalhes da pessoa
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana Paula", 28, "Engenheira");

        // Exibindo os detalhes da pessoa
        pessoa1.exibirDetalhes();
    }
}
