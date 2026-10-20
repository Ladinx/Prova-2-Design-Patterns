import java.util.List;

public class PassagemFerroviaria extends Passagem {

    private static final double TAXA_EMBARQUE = 0.05;

    @Override
    public String modal() {
        return "Ferroviario";
    }

    @Override
    public double taxaEmbarque(double tarifa) {
        return tarifa * TAXA_EMBARQUE;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("documento de identidade com foto", "comprovante de reserva");
    }
}
