public class CriadorPassagemRodoviaria extends CriadorPassagem {

    @Override
    protected Passagem criarPassagem() {
        return new PassagemRodoviaria();
    }
}
