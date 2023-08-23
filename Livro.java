public class Livro {
    String titulo, autor;
    int ano
    double preco;

    void mostrarDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }

    void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }
}
