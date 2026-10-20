public class CriadorPassagemBondinho extends CriadorPassagem {

    @Override
    protected Passagem criarPassagem() {
        return new PassagemBondinho();
    }
}
