import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testComportamentoAutor() {
        // construtor true = é usuário
        Autor autor = new Autor("Jessica Felix", "Brasileira", true);

        assertEquals("Jessica Felix", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertTrue(autor.isAutorUsuario());

        Livro livroTec = new Livro("Java", autor, "Tecnologia", true);
        Livro livroFic = new Livro("Harry Potter", autor, "Ficcao", true);

        assertEquals(2, autor.getObrasPublicadas().size());

        List<Livro> livrosTecnologia = autor.getObrasPublicadasPorGenero("Tecnologia");
        assertEquals(1, livrosTecnologia.size());
        assertEquals("Java", livrosTecnologia.get(0).getTitulo());

        autor.setAutorUsuario(false);
        assertFalse(autor.isAutorUsuario());
    }
}