import java.util.List;

public class PassagemAerea extends Passagem {

    private static final double TAXA_EMBARQUE = 0.08;

    @Override
    public String modal() {
        return "Aereo";
    }

    @Override
    public double taxaEmbarque(double tarifa) {
        return tarifa * TAXA_EMBARQUE;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("documento de identidade com foto", "bilhete eletronico (e-ticket)");
    }
}
