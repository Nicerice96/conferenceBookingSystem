import java.util.EventListener;

public interface BookingListener extends EventListener {

    void handleConferenceEvent(ConferenceEvent event);
}
