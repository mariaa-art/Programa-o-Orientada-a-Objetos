import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class EmprestimoTest {

    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);

    @Test
    public void testCriacaoEmprestimo() {
        Emprestimo emp = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emp.getDataRetirada());
        assertEquals(dataDevolucao, emp.getDataDevolucao());
        assertEquals(livro, emp.getLivro());
        assertEquals(usuario, emp.getUsuario());
    }

    @Test
    public void testSetDataDevolucao() {
        Emprestimo emp = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        Date novaData = new Date();

        emp.setDataDevolucao(novaData);
        assertEquals(novaData, emp.getDataDevolucao());
    }

    @Test
    public void testSetLivro() {
        Emprestimo emp = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        Livro novoLivro = new Livro("Java POO", new Autor("Grace Hopper", "Americana"), "Tecnologia", true);
        emp.setLivro(novoLivro);

        assertEquals(novoLivro, emp.getLivro());
    }

    @Test
    public void testSetUsuario() {
        Emprestimo emp = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        Usuario novoUsuario = new Usuario("Maria", 19);
        emp.setUsuario(novoUsuario);

        assertEquals(novoUsuario, emp.getUsuario());
    }
}
