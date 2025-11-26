import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Maria", "Brasileira");

        assertEquals("Maria", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("João", "Brasileiro");
        autor.setNome("Carlos");

        assertEquals("Carlos", autor.getNome());
    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("João", "Brasileiro");
        autor.setNacionalidade("Argentino");

        assertEquals("Argentino", autor.getNacionalidade());
    }
}
