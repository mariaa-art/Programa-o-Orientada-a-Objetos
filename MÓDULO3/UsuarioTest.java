import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriacaoUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("Lucas", 30);
        usuario.setNome("Pedro");

        assertEquals("Pedro", usuario.getNome());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario("Lucas", 30);
        usuario.setIdade(25);

        assertEquals(25, usuario.getIdade());
    }
}
