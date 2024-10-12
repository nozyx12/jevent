package io.github.nozyx12.jevent;

/**
 * The {@code EventListener} interface should be implemented by any class
 * that wants to listen for events. Classes implementing this interface
 * can define custom behavior when an event is triggered.
 */
public interface EventListener {
    /**
     * Called when an event is triggered.
     *
     * @param eventName the name of the event that was triggered
     * @param args additional arguments related to the event
     * @throws Throwable if an error occurs during event handling
     */
    void onEventTriggered(String eventName, String[] args) throws Throwable;
}