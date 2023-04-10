package com.fes.aragon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiendaCamisasTest {

    @Test
    void calcularDescuento() {
        assertAll(() -> assertEquals(0.0, TiendaCamisas.calcularDescuento(0)),
                () -> assertEquals(0.0, TiendaCamisas.calcularDescuento(1)),
                () -> assertEquals(0.0, TiendaCamisas.calcularDescuento(2)),
                () -> assertEquals(0.05, TiendaCamisas.calcularDescuento(3)),
                () -> assertEquals(0.05, TiendaCamisas.calcularDescuento(4)),
                () -> assertEquals(0.05, TiendaCamisas.calcularDescuento(5)),
                () -> assertEquals(0.08, TiendaCamisas.calcularDescuento(6)));

        //assertEquals(0.76, TiendaCamisas.calcularDescuento(76));
    }

    @Test
    void totalConDescuento() {
        assertAll(() -> assertEquals(0.0, TiendaCamisas.totalConDescuento(0,0.0)),
                () -> assertEquals(693.5, TiendaCamisas.totalConDescuento(730,0.05)),
                () -> assertEquals(190.0, TiendaCamisas.totalConDescuento(190,0.0)),
                () -> assertEquals(2014.8, TiendaCamisas.totalConDescuento(2190,0.08)),
                () -> assertEquals(902.5, TiendaCamisas.totalConDescuento(950,0.05)),
                () -> assertEquals(620.0, TiendaCamisas.totalConDescuento(620,0.0)),
                () -> assertEquals(1026.0, TiendaCamisas.totalConDescuento(1080,0.05)));

        //assertEquals(2014.0, TiendaCamisas.totalConDescuento(2190,0.08));
    }
}