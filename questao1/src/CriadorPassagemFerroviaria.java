public class CriadorPassagemFerroviaria extends CriadorPassagem {

    @Override
    protected Passagem criarPassagem() {
        return new PassagemFerroviaria();
    }
}
