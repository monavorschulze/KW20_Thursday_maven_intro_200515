public class Alertlevel {

    public static String checkAlertlevel(String alert) {
        switch (alert) {
            case "green":
                return "Keine Personen";
            case "yellow":
                return "max. 30 Personen";
            case "red":
                return "max. 60 Personen";
        }

        return alert;
    }

}