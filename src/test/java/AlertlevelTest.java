import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlertlevelTest {

    @Test
    @DisplayName("Alarm grün wenn sich keine Personen im Laden befinden")
    public void ifNoPeople() {
        //GIVEN
        String alert = "green";

        //WHEN
        String result = Alertlevel.checkAlertlevel(alert);

        //THEN
        assertEquals("Keine Personen", result);

    }

    @Test
    @DisplayName("Alarm gelb wenn sich 30 Personen im Laden befinden")
    public void if30People() {
        //GIVEN
        String alert = "yellow";

        //WHEN
        String result = Alertlevel.checkAlertlevel(alert);

        //THEN
        assertEquals("max. 30 Personen", result);

    }

    @Test
    @DisplayName("Alarm rot wenn sich 60 Personen im Laden befinden")
    public void if60People() {
        //GIVEN
        String alert = "red";

        //WHEN
        String result = Alertlevel.checkAlertlevel(alert);

        //THEN
        assertEquals("max. 60 Personen", result);

    }


}