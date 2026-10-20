public class ComprovanteCpf implements ComprovanteMatricula {

    @Override
    public String gerar(Inscricao inscricao) {
        return "Comprovante de matricula | aluno " + inscricao.aluno() + " | CPF " + inscricao.documento();
    }
}
