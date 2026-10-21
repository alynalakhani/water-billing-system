package com.nwsc.arua;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BillCalculatorTest {
    @Test
    void billIsUnitsTimesRate() {
        assertEquals(70000.0, BillCalculator.calculateBill(20, 3500), 0.001);
    }
}
