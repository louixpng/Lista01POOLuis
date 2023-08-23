public class Livro {
    String titulo, autor;
    int anoPublicacao;
    double preco;

    Livro (String titulo, String autor, int anoPublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    void mostrarDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Preço: R$ " + preco);
    }

    void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }
}
