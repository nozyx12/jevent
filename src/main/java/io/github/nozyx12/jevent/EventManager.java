package io.github.nozyx12.jevent;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code EventManager} class manages the registration of event listeners
 * and triggers events. It allows for the registration of listeners and
 * handles the invocation of their respective event handling methods.
 */
public class EventManager {
    private final List<EventListener> listeners = new ArrayList<>();

    /**
     * Registers a new event listener. If the listener is already registered,
     * it will not be added again.
     *
     * @param listener the event listener to register
     */
    public void registerListener(EventListener listener) {
        if (!this.listeners.contains(listener)) this.listeners.add(listener);
    }

    /**
     * Triggers an event with the specified name and arguments. All registered
     * listeners will be notified of the event. If an error occurs in a listener,
     * an {@code EventException} will be thrown.
     *
     * @param eventName the name of the event to trigger
     * @param args additional arguments related to the event
     * @throws EventException if an error occurs while triggering the event
     */
    public void triggerEvent(String eventName, String... args) throws EventException {
        for (EventListener listener : this.listeners) {
            try {
                listener.onEventTriggered(eventName, args);
            } catch (Throwable th) {
                throw new EventException(eventName, th);
            }
        }
    }
}
