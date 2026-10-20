public class FabricaBrasil implements FabricaMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalServico();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoPix();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteCpf();
    }
}
