import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    @Test
    public void testComportamentoEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());

        assertFalse(livro.isDisponivel());

        emprestimo.setDataRetirada(dataRetirada);
        emprestimo.setDataDevolucao(dataDevolucao);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());

        Usuario novoUsuario = new Usuario("Novo User", 99);
        emprestimo.setUsuario(novoUsuario);
        assertEquals(novoUsuario, emprestimo.getUsuario());
    }
}