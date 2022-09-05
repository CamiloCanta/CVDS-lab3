package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TarifasTest {
    private CalculadorDescuentos d = new CalculadorDescuentos();

    @Test
    public void validacionDias() {
        assertEquals(8500.0, d.calculoTarifa(10000,25,20));
        assertEquals(5865000.0, d.calculoTarifa(6900000,30,50));
        assertEquals(6900000.0, d.calculoTarifa(6900000,20,25));
    }

    @Test
    public void validacionMenorEdad() {
        assertEquals(95000.0, d.calculoTarifa(100000,2,5));
        assertEquals(6555000.0, d.calculoTarifa(6900000,10,17));
        assertEquals(1234567.0, d.calculoTarifa(1234567,19,18));
    }
    @Test
    public void validacionAcomulado() {
        assertEquals(77000.0, d.calculoTarifa(100000,256,70));
        assertEquals(5520000.0, d.calculoTarifa(6900000,80,5));
    }
}
