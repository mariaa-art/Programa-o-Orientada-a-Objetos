import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testComportamentoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals(autor, livro1.getAutor());
        assertTrue(livro1.isDisponivel());

        assertEquals("Java Avançado", livro2.getTitulo());
        assertFalse(livro2.isDisponivel());

        livro1.validarDisponibilidade();
        livro2.validarDisponibilidade();

        livro1.setTitulo("Java Intermediário");
        assertEquals("Java Intermediário", livro1.getTitulo());

        livro1.setDisponivel(false);
        assertFalse(livro1.isDisponivel());
    }
}