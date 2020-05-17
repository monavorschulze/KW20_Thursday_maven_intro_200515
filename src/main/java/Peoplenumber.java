public class Peoplenumber {


    public static String checkPeoplenumber(int number) {
        if (number<0){
            return "invalide Eingabe";
        }

        if (number>30){
            return "Zu viele Personen";
        }else {
            return "Maximale Personenzahl nicht überschritten";
        }


        }
    }
