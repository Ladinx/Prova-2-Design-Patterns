public class CriadorPassagemAerea extends CriadorPassagem {

    @Override
    protected Passagem criarPassagem() {
        return new PassagemAerea();
    }
}
