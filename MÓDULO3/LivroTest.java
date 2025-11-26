import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    public void testCriacaoLivro() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getCategoria());
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testDisponibilidadeTrue() {
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testDisponibilidadeFalse() {
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        livro1.setDisponivel(false);
        assertFalse(livro1.isDisponivel());
    }

    @Test
    public void testSetTitulo() {
        livro1.setTitulo("Java Mega Básico");
        assertEquals("Java Mega Básico", livro1.getTitulo());
    }

    @Test
    public void testSetCategoria() {
        livro1.setCategoria("Programação");
        assertEquals("Programação", livro1.getCategoria());
    }
}
