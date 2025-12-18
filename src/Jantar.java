public class Jantar {
    private final int quantidade;
    private Garfo[] garfos;
    private Fisolofo[] fisolofos;

    public Jantar(int quantidade) {
        this.quantidade = quantidade;
    }

    public void iniciar() {
        garfos = new Garfo[quantidade];
        fisolofos = new Fisolofo[quantidade];
        for (int i = 0; i < quantidade; i++) {
            garfos[i] = new Garfo(i);
        }
        for (int i = 0; i < quantidade; i++) {
            Garfo esquerdo = garfos[i];
            Garfo direito = garfos[(i + 1) % quantidade];
            fisolofos[i] = new Fisolofo(i, esquerdo, direito);
        }
    }

    public Garfo[] getGarfos() {
        return garfos;
    }

    public Fisolofo[] getFisolofos() {
        return fisolofos;
    }
}


