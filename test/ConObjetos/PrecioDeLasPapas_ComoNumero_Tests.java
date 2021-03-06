package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLasPapas_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDePapas elTipoDePapas;

    @Test
    public void Papas_PapasPequeñas_PrecioEstablecido() {
        elResultadoEsperado = 800;

        elTipoDePapas = TipoDePapas.Pequeña;
        elResultadoObtenido = new PrecioDeLasPapas(elTipoDePapas).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_PrecioEstablecido() {
        elResultadoEsperado = 900;

        elTipoDePapas = TipoDePapas.Mediana;
        elResultadoObtenido = new PrecioDeLasPapas(elTipoDePapas).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasGrandes_PrecioEstablecido() {
        elResultadoEsperado = 1000;

        elTipoDePapas = TipoDePapas.Grande;
        elResultadoObtenido = new PrecioDeLasPapas(elTipoDePapas).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
