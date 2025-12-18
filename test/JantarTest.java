import org.junit.Test;
import static org.junit.Assert.*;

public class JantarTest {
    @Test
    public void deveConfigurarJantarComFilosofosEGarfos() {
        Jantar jantar = new Jantar(5);
        jantar.iniciar();
        Garfo[] garfos = jantar.getGarfos();
        Fisolofo[] fisolofos = jantar.getFisolofos();
        assertNotNull(garfos);
        assertNotNull(fisolofos);
        assertEquals(5, garfos.length);
        assertEquals(6, fisolofos.length);
    }
}


