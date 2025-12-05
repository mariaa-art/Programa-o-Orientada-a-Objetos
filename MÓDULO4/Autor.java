import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean autorUsuario;

    public Autor(String nome, String nacionalidade, boolean autorUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.autorUsuario = autorUsuario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isAutorUsuario() {
        return autorUsuario;
    }

    public void setAutorUsuario(boolean autorUsuario) {
        this.autorUsuario = autorUsuario;
    }

    public List<Livro> getObrasPublicadas() {
        return getLivros();
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> obrasFiltradas = new ArrayList<>();
        for (Livro livro : getLivros()) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                obrasFiltradas.add(livro);
            }
        }
        return obrasFiltradas;
    }
}