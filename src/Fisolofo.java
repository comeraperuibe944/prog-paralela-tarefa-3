public class Fisolofo extends Thread {
    private final int indice;
    private final Garfo garfoEsquerdo;
    private final Garfo garfoDireito;

    public Fisolofo(int indice, Garfo garfoEsquerdo, Garfo garfoDireito) {
        this.indice = indice;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
    }

    public int getIndice() {
        return indice;
    }

    public Garfo getGarfoEsquerdo() {
        return garfoEsquerdo;
    }

    public Garfo getGarfoDireito() {
        return garfoDireito;
    }

    @Override
    public void run() {
    }
}


