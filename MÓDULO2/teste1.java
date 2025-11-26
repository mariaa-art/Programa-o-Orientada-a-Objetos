import java.util.Date;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Autor extends Pessoa {
    public Autor(String nome, int idade) {
        super(nome, idade);
    }
}
class Usuario extends Pessoa {
    public Usuario(String nome, int idade) {
        super(nome, idade);
    }
}
class Livro {
    private String titulo;
    private String genero;
    private Autor autor; 
    private boolean disponivel;

    public Livro(String titulo, String genero, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.disponivel = true; 
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }
}

class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            this.livro = livro;
            this.usuario = usuario;
            this.dataRetirada = new Date(); 
            this.dataDevolucao = new Date(); 
            this.livro.setDisponivel(false);
        } else {
            System.out.println("Erro: O livro " + livro.getTitulo() + " já está emprestado!");
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

// 6. Classe MAIN (Execução)
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 30); 
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.imprimirComprovante();
    }
}