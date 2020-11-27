package ir.rhotiz.kata.p02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //use alt+insert to generate test method and (before and after and ...)
    @Test
    void testCalculatorAdd() {
        assertEquals(2, new Calculator().add(1,1));
    }

    @Test
    void testCalculateMinus() {
        assertEquals(0, new Calculator().minus(1,1));
    }

    //open run dialog with alt+shift+f10
    //   (if shift+f10 is intercepted with windows toggle maximize window, disable it)
    //open debug dialog with alt+shift+f9

    //run last config with shift+f10
    //debug last config with shift+f9

    //fold with ctrl+. or ctlr+-
}