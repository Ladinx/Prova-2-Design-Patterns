public class Main {

    public static void main(String[] args) {
        new CriadorPassagemAerea().emitir(new Emissao("Rebecca", 3_500.00));
        new CriadorPassagemRodoviaria().emitir(new Emissao("Arthur", 180.00));
        new CriadorPassagemFerroviaria().emitir(new Emissao("Escobar", 95.00));
        new CriadorPassagemBondinho().emitir(new Emissao("Matheus", 119.00));
    }
}
