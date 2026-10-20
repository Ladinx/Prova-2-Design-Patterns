public class ComprovanteDni implements ComprovanteMatricula {

    @Override
    public String gerar(Inscricao inscricao) {
        return "Comprovante de matricula | aluno " + inscricao.aluno() + " | DNI " + inscricao.documento();
    }
}
