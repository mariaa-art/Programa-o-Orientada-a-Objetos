import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    @Test
    public void testEstrategiaPublicacao() {
        Autor autor = new Autor("Martin Fowler", "Inglês", false);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        String resultadoLivro = autor.publicar("Refactoring");
        assertEquals("Publicando o livro: Refactoring no catálogo oficial.", resultadoLivro);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        String resultadoArtigo = autor.publicar("Microservices Guide");
        assertEquals("Publicando o artigo: Microservices Guide em revista científica.", resultadoArtigo);
    }

    @Test
    public void testSemEstrategia() {
        Autor autor = new Autor("Autor Teste", "Brasileiro", true);
        String resultado = autor.publicar("Obra sem tipo");
        assertEquals("Nenhuma estratégia de publicação definida.", resultado);
    }
}