import java.util.List;

public class PassagemRodoviaria extends Passagem {

    private static final double TAXA_EMBARQUE = 0.03;

    @Override
    public String modal() {
        return "Rodoviario";
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
