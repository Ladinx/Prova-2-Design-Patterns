public class Matricula {

    private final FabricaMatricula fabrica;

    public Matricula(FabricaMatricula fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(Inscricao inscricao) {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        ProcessadorPagamento pagamento = fabrica.criarProcessadorPagamento();
        ComprovanteMatricula comprovante = fabrica.criarComprovanteMatricula();
        System.out.println("Matricula de " + inscricao.aluno());
        System.out.println("  Documento fiscal: " + documentoFiscal.emitir(inscricao));
        System.out.println("  Pagamento: " + pagamento.processar(inscricao));
        System.out.println("  Comprovante de matricula: " + comprovante.gerar(inscricao));
        System.out.println();
    }
}
