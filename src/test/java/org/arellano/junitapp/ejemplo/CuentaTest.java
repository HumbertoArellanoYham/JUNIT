package org.arellano.junitapp.ejemplo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testNombreDeCuenta(){
        Cuenta cuenta = new Cuenta("Carlos", new BigDecimal("10000.500"));

        String resultado = "Carlos";
        String nombreCuenta = cuenta.getNombre();

        assertEquals(resultado, nombreCuenta);
    }

    @Test
    void testSaldoDeLaCuenta(){
        Cuenta cuenta = new Cuenta("Miguel", new BigDecimal("10000.500"));
        assertEquals(10000.500, cuenta.getSaldo().doubleValue());
    }

    @Test
    void testVerificarPorRerefenciaValor(){
        Cuenta cuenta1 = new Cuenta("Vincent", new BigDecimal("1000.500"));
        Cuenta cuenta2 = new Cuenta("Vincent", new BigDecimal("1000.500"));

        assertEquals(cuenta1, cuenta2);
    }
}