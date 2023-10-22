package org.example.Java5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/moneyCalc.csv")
    public void countCalc10000(int income, int expense, int threshold, int expected) {

        MoneyCalcService service = new MoneyCalcService();

        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
