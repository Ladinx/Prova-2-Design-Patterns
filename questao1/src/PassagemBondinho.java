import java.util.List;

public class PassagemBondinho extends Passagem {

    private static final double TAXA_EMBARQUE = 0.10;

    @Override
    public String modal() {
        return "Bondinho";
    }

    @Override
    public double taxaEmbarque(double tarifa) {
        return tarifa * TAXA_EMBARQUE;
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("documento de identidade com foto");
    }
}
