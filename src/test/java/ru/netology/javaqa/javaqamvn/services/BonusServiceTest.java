
package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")
    public void testRegisteredUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();


        int actual = service.calcBonus(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

}
