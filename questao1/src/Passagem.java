import java.util.List;

public abstract class Passagem {

    public abstract String modal();

    public abstract double taxaEmbarque(double tarifa);

    public abstract List<String> documentosExigidos();
}
