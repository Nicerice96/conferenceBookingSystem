Question:

Consider a scenario where you are developing a booking system for a conference. The system needs to notify various modules and components in the application when significant events occur, such as a new booking being made, a booking being canceled, or the conference schedule being updated.

Design and implement the Java Event Model to handle these events efficiently. Your implementation should include the following:

1. Define an event class (e.g., `ConferenceEvent`) that encapsulates information about the event, such as the event type, relevant details, and a timestamp.

2. Implement an event source class (e.g., `ConferenceManager`) that manages the events and notifies registered event listeners when events occur. This class should provide methods to add and remove event listeners.

3. Create event listener interfaces (e.g., `BookingListener`, `ScheduleListener`) with appropriate methods that should be implemented by classes interested in receiving notifications about specific events.

4. Develop concrete classes that implement the event listener interfaces. For example, a `BookingNotificationModule` class that implements the `BookingListener` interface to respond to booking-related events.

5. Demonstrate the usage of your Java Event Model in a sample application. Create an instance of the event source, register event listeners, and trigger events to observe the notifications.

Ensure that your implementation follows best practices for event handling, promotes loose coupling between components, and allows for extensibility in handling various types of events in the conference booking system.