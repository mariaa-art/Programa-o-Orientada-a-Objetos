import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testComportamentoUsuario() {
        Usuario usuario = new Usuario("Lucas", 30);

        assertEquals("Lucas", usuario.getNome());
        assertEquals(30, usuario.getIdade());

        assertNotNull(usuario.getHistoricoEmprestimos());
        assertEquals(0, usuario.getHistoricoEmprestimos().size());

        Autor autor = new Autor("Teste", "Teste");
        Livro livro = new Livro("Teste", autor, "Geral", true);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        assertEquals(1, usuario.getHistoricoEmprestimos().size());
        assertEquals(emprestimo, usuario.getHistoricoEmprestimos().get(0));

        usuario.setNome("Lucas Silva");
        usuario.setIdade(31);

        assertEquals("Lucas Silva", usuario.getNome());
        assertEquals(31, usuario.getIdade());
    }
}