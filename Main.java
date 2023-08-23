public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro();

        l1.titulo = "Harry Potter";
        l1.autor = "Emma Wattson";
        l1.ano = "1995";
        l1.preco = 70.0;
        l1.mostrarDetalhes();
        l1.alterarPreco(50.0);

        l2.titulo = "O Auto da Compadecida";
        l2.autor = "Ariano Suassuna";
        l2.ano = "1989";
        l2.preco = 85.0;
        l2.mostrarDetalhes();
        l2.alterarPreco(42.0);
    }

}
