package padroescomportamentais.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Mediator")
class MoradorTest {

    @Test
    void deveElogiarCondominio() {
        Morador aluno = new Morador();
        assertEquals("O Sindico agradece seu contato.\nO Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Condominio agradece a mensagem: Ótima manutenção",
                aluno.elogiarCondominio("Ótima manutenção"));
    }

    @Test
    void deveReclamarCondominio() {
        Morador aluno = new Morador();
        assertEquals("O Sindico agradece seu contato.\nO Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Condominio vai procurar melhorar o serviço da reclamação: Luz queimada",
                aluno.reclamarCondominio("Luz queimada"));
    }

    @Test
    void deveSugerirMelhorasCondominio() {
        Morador aluno = new Morador();
        assertEquals("O Sindico agradece seu contato.\nO Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Condominio vai analisar a sugestão: Mudar cor dos predios",
                aluno.sugerirMelhorasCondominio("Mudar cor dos predios"));
    }

}
