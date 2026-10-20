public class FabricaChile implements FabricaMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaElectronica();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteRut();
    }
}
