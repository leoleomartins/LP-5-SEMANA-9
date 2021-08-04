package padroescomportamentais.mediator;

public class Condominio {
    private static Condominio instancia = new Condominio();

    private Condominio() {}

    public static Condominio getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Condominio vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Condominio agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Condominio vai analisar a sugestão: " + mensagem;
    }
}
