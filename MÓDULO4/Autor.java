public class Autor {

    private String nome;
    private String nacionalidade;
    private boolean isUsuario; // NOVO CAMPO

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean usuario) {
        isUsuario = usuario;
    }
}
