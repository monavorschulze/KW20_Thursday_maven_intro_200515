
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

@Test
public void fivePlus3ShouldBe8 (){

    //Given
    int firstValue = 5;
    int secondValue = 3;

    //When
    int result = Calculation.add(firstValue, secondValue);

    //Then
    assertEquals (8, result);

    }
}