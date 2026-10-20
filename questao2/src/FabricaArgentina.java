public class FabricaArgentina implements FabricaMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new FacturaElectronica();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoMercadoPago();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteDni();
    }
}
