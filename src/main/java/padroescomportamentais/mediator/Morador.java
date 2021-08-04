package padroescomportamentais.mediator;

public class Morador {

    public String elogiarCondominio(String mensagem) {
        return Sindico.getInstancia().receberElogioCondominio(mensagem);
    }

    public String reclamarCondominio(String mensagem) {
        return Sindico.getInstancia().receberReclamacaoCondominio(mensagem);
    }

    public String sugerirMelhorasCondominio(String mensagem) {
        return Sindico.getInstancia().receberSugestaoCondominio(mensagem);
    }
}
