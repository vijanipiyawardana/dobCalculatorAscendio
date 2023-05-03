import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DobCalculatorTest {

    private DobCalculator dobcalculator = new DobCalculator();
    @Test
    void shouldReturnCorrectNumberOfDays(){
       long numberOfDays = dobcalculator.calculateAgeInDays(dobcalculator.formatDOB("2000-01-01"));
       assertTrue(numberOfDays == 8523);
    }

}