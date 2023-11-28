import java.util.ArrayList;

public class ConferenceManager {

    private ArrayList<BookingListener> listeners = new ArrayList<BookingListener>();


    public void addMyEventListener(BookingListener listener){
        listeners.add(listener);

    }

    public void removeMyEventListener(BookingListener listener){
        listeners.remove(listener);
    }

    protected void notifyMyEventOccured(){

        ConferenceEvent event = new ConferenceEvent(this);

        for (BookingListener listener : listeners){
            listener.handleConferenceEvent(event);
        }
    }

}
