import java.util.Locale;

public class BoletaElectronica implements DocumentoFiscal {

    private static final double IVA = 0.19;

    @Override
    public String emitir(Inscricao inscricao) {
        double total = inscricao.valor() * (1 + IVA);
        return "Boleta electronica | IVA 19% | total "
                + String.format(Locale.of("es", "CL"), "%,.2f", total) + " CLP";
    }
}
