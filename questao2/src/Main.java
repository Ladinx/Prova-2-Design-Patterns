public class Main {

    public static void main(String[] args) {
        Inscricao inscricaoBrasil = new Inscricao("Bolsonaro", "847.563.290-11", 1_299.90);
        Inscricao inscricaoChile = new Inscricao("Lula", "12.345.678-9", 240_000.00);
        Inscricao inscricaoArgentina = new Inscricao("Pedro Alvarez", "30.829.600", 180_000.00);

        new Matricula(new FabricaBrasil()).confirmar(inscricaoBrasil);
        new Matricula(new FabricaChile()).confirmar(inscricaoChile);
        new Matricula(new FabricaArgentina()).confirmar(inscricaoArgentina);
    }
}
