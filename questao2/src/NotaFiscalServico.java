import java.util.Locale;

public class NotaFiscalServico implements DocumentoFiscal {

    private static final double ISS = 0.05;

    @Override
    public String emitir(Inscricao inscricao) {
        double total = inscricao.valor() * (1 + ISS);
        return "Nota fiscal de servico (NFS-e) | ISS 5% | total R$ "
                + String.format(Locale.of("pt", "BR"), "%,.2f", total);
    }
}
