package io.github.nozyx12.jevent;

/**
 * The {@code EventUtil} class provides utility methods for accessing the
 * system event manager. It is a singleton that allows global access to
 * the main event manager instance.
 */
public class EventUtil {
    private static final EventManager systemEventManager = new EventManager();

    /**
     * Returns the system event manager instance.
     *
     * @return the system event manager
     */
    public static EventManager getSystemEventManager() {
        return systemEventManager;
    }
}
