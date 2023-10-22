package org.example.Java5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyCalcServiceTest {

    @Test
        public void countCalc10000() {

        MoneyCalcService service = new MoneyCalcService();
        int income = 10000;
        int expense = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countCalc100000() {

        MoneyCalcService service = new MoneyCalcService();

        int income = 100000;
        int expense = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
