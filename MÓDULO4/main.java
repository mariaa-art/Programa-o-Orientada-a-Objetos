public class Main {
    public static void main(String[] args) {

        Autor autorTradicional = new Autor("Alan Turing", "Inglês", false);
        Autor autorUsuario = new Autor("Gabriel", "Brasileiro", true);

        Livro livro = new Livro("Java Basics", autorTradicional, "Tecnologia", true);

        Artigo artigo = new Artigo("Entendendo Compiladores", autorUsuario, "Tecnologia", true);

        System.out.println("Livro: " + livro.getTitulo() + " - Autor: " + livro.getAutor().getNome());
        System.out.println("Artigo: " + artigo.getTitulo() + " - Autor: " + artigo.getAutor().getNome());
    }
}
