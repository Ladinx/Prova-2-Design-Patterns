import java.util.Locale;

public abstract class CriadorPassagem {

    public final void emitir(Emissao emissao) {
        Passagem passagem = criarPassagem();
        double taxaEmbarque = passagem.taxaEmbarque(emissao.tarifa());
        System.out.println("Modal: " + passagem.modal());
        System.out.println("Passageiro: " + emissao.passageiro());
        System.out.println("Taxa de embarque: R$ " + String.format(Locale.of("pt", "BR"), "%,.2f", taxaEmbarque));
        System.out.println("Documentos exigidos: " + String.join(" e ", passagem.documentosExigidos()));
        System.out.println();
    }

    protected abstract Passagem criarPassagem();
}
