import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testComportamentoArtigo() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());

        artigo.setTitulo("Compiladores Avançados");
        assertEquals("Compiladores Avançados", artigo.getTitulo());

        artigo.setPublicado(false);
        assertFalse(artigo.isPublicado());
    }
}