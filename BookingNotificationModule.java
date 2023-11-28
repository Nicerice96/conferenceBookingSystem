public class BookingNotificationModule implements BookingListener{
    @Override
    public void handleConferenceEvent(ConferenceEvent event) {
        System.out.println("Booked!");

    }
}
