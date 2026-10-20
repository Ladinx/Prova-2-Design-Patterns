public class PagamentoMercadoPago implements ProcessadorPagamento {

    @Override
    public String processar(Inscricao inscricao) {
        return "Pagamento via Mercado Pago | DNI " + inscricao.documento();
    }
}
