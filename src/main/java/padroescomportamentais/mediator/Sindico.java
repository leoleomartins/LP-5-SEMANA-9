package padroescomportamentais.mediator;

public class Sindico {

    private static Sindico instancia = new Sindico();

    private Sindico() {}

    public static Sindico getInstancia() {
        return instancia;
    }

    public String receberElogioCondominio(String mensagem) {
        return "O Sindico agradece seu contato.\n"+
                "O Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Condominio.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCondominio(String mensagem) {
        return "O Sindico agradece seu contato.\n"+
                "O Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Condominio.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCondominio(String mensagem) {
        return "O Sindico agradece seu contato.\n"+
                "O Condominio respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Condominio.getInstancia().receberSugestao(mensagem);
    }
}
