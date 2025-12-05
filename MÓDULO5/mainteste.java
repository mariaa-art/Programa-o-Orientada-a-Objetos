public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        System.out.println("--- Validação de Disponibilidade ---");
        livro.validarDisponibilidade();

        System.out.println("\n--- Dados do Empréstimo ---");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("O autor é usuário? " + emprestimo.getLivro().getAutor().isAutorUsuario());
        System.out.println("Genero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        
        System.out.println("\n--- Dados do Artigo ---");
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Publicado: " + artigo.isPublicado());

        System.out.println("\n--- Padrão Strategy (Publicação) ---");
        
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        System.out.println(autor.publicar(livro.getTitulo()));

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        System.out.println(autor.publicar(artigo.getTitulo()));
    }
}