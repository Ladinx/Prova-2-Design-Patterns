public interface FabricaMatricula {

    DocumentoFiscal criarDocumentoFiscal();

    ProcessadorPagamento criarProcessadorPagamento();

    ComprovanteMatricula criarComprovanteMatricula();
}
