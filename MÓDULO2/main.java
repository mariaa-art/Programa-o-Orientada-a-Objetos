public class Main {
    public static void main(String[] args) {
        
        // instanciando objeto
        Autor autor = new Autor("Jessica Felix", 30);
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        //realizando 
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        
        //imprimindo result
        emprestimo.imprimirComprovante();
    }
}