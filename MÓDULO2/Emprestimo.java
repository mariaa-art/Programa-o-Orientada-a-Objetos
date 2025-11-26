import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            this.livro = livro;
            this.usuario = usuario;
            this.dataRetirada = new Date();
            this.dataDevolucao = new Date(); // Devolução imediata para fins do exercício
            
            this.livro.setDisponivel(false);
        } else {
            System.out.println("Erro: O livro já está emprestado!");
        }
    }

    public void imprimirComprovante() {
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        } else {
            System.out.println("O livro está disponível");
        }
        
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolucao: " + dataDevolucao);
    }
}