public class PagamentoWebpay implements ProcessadorPagamento {

    @Override
    public String processar(Inscricao inscricao) {
        return "Pagamento via Webpay | RUT " + inscricao.documento();
    }
}
