import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeoplenumberTest {

    @Test
    public void IfTheNumberOfPersonsIsBiggerThanThirtyReturnToMuchPeople(){
      //GIVEN
        int number = 31;

        //WHEN
        String result = Peoplenumber.checkPeoplenumber(number);

        //THEN
        assertEquals("Zu viele Personen",result);

    }

    @Test
    public void IfTheNumberOfPersonsIsUnderThanThirtyReturnMaxNumberOfPeople(){
        //GIVEN
        int number = 29;

        //WHEN
        String result =Peoplenumber.checkPeoplenumber(number);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", result);
    }



}