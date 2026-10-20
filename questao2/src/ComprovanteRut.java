public class ComprovanteRut implements ComprovanteMatricula {

    @Override
    public String gerar(Inscricao inscricao) {
        return "Comprovante de matricula | aluno " + inscricao.aluno() + " | RUT " + inscricao.documento();
    }
}
