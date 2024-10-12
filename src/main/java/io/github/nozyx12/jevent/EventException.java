package io.github.nozyx12.jevent;

/**
 * The {@code EventException} class represents an exception that occurs
 * during the triggering of an event. This exception includes the event
 * name and the underlying cause of the error.
 */
public class EventException extends Exception {
    private final String eventName;

    /**
     * Constructs a new {@code EventException} with the specified event
     * name and cause.
     *
     * @param eventName the name of the event that caused the exception
     * @param cause the cause of the exception
     */
    protected EventException(String eventName, Throwable cause) {
        super("An error occurred triggering the event with name: " + eventName, cause);
        this.eventName = eventName;
    }

    /**
     * Returns the name of the event that caused this exception.
     *
     * @return the event name
     */
    public String getEventName() {
        return this.eventName;
    }
}
