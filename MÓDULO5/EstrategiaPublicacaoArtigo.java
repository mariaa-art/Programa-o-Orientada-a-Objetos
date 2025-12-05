public class EstrategiaPublicacaoArtigo implements PublicavelInterface {
    @Override
    public String publicar(String titulo) {
        return "Publicando o artigo: " + titulo + " em revista científica.";
    }
}