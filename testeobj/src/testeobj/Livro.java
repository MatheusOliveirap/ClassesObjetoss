
package testeobj;


public class Livro {
    
     private String titulo;
    private String autor;
    private int numeroPaginas;
    private int exemplaresDisponiveis;

    // Construtor da classe
    public Livro(String titulo, String autor, int numeroPaginas, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    // Método para emprestar um livro
    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            System.out.println("Livro emprestado com sucesso! Exemplares disponíveis: " + exemplaresDisponiveis);
        } else {
            System.out.println("Não há exemplares disponíveis para empréstimo.");
        }
    }

    // Método para devolver um livro
    public void devolver() {
        exemplaresDisponiveis++;
        System.out.println("Livro devolvido com sucesso! Exemplares disponíveis: " + exemplaresDisponiveis);
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Exemplares Disponíveis: " + exemplaresDisponiveis);
    }

    
    
}
