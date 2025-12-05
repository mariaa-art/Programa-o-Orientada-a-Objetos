public class EstrategiaPublicacaoLivro implements PublicavelInterface {
    @Override
    public String publicar(String titulo) {
        return "Publicando o livro: " + titulo + " no catálogo oficial.";
    }
}