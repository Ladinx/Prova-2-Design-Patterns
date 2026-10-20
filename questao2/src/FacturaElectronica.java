import java.util.Locale;

public class FacturaElectronica implements DocumentoFiscal {

    private static final double IVA = 0.21;

    @Override
    public String emitir(Inscricao inscricao) {
        double total = inscricao.valor() * (1 + IVA);
        return "Factura electronica | IVA 21% | total "
                + String.format(Locale.of("es", "AR"), "%,.2f", total) + " ARS";
    }
}
