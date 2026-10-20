public class PagamentoPix implements ProcessadorPagamento {

    @Override
    public String processar(Inscricao inscricao) {
        return "Pagamento via Pix | CPF " + inscricao.documento();
    }
}
