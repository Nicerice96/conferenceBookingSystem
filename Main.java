public class Main {

    public static void main (String [] args){


        ConferenceManager ConferenceManager = new ConferenceManager();

        BookingNotificationModule mod_one = new BookingNotificationModule();
        BookingNotificationModule mod_two = new BookingNotificationModule();

        ConferenceManager.addMyEventListener(mod_one);
        ConferenceManager.addMyEventListener(mod_two);

        ConferenceManager.notifyMyEventOccured();
    }
}
