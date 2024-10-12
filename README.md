# JEvent

JEvent is a lightweight Java library designed for dynamic event management. It allows developers to create, manage, and trigger events in their applications easily. By implementing the `EventListener` interface, users can define custom behaviors that respond to various events.

## Features

- Register and manage multiple event listeners.
- Trigger events with a name and optional arguments.
- Handle exceptions thrown during event processing.
- Simple and intuitive API for quick integration.

## How to obtain an EventManager

```java
EventManager manager = EventUtil.getSystemEventManager();
```

#### Or create your own EventManager:

```java
EventManager manager = new EventManager();
```

## How to create an EventListener

```java
public class MyListener implements EventListener {
    public void onEventTriggered(String eventName, String[] args) throws Throwable {
        // Interpret event name and args and add your logic...
    }
}
```

#### Or simply create an anonymous class:

```java
new EventListener() {
    @Override
    public void onEventTriggered(String eventName, String[] args) throws Throwable {
        // Interpret event name and args and add your logic...
    }
}
```

## How to register an EventListener

```java
manager.registerListener(myEventListener);
```

## How to trigger an event

```java
manager.triggerEvent("myEventName", "arg1", "arg2", "..."); // Throws EventException if an error occurs triggering the event
```

## Installation

For Maven:
```xml
<dependency>
    <groupId>io.github.nozyx12</groupId>
    <artifactId>jevent</artifactId>
    <version>1.0</version> <!-- Update with the latest version -->
</dependency>
```

For Gradle (Groovy DSL):
```groovy
implementation "io.github.nozyx12:jevent:1.0" // Update with the latest version
```

For Gradle (Kotlin DSL):
```kotlin
implementation("io.github.nozyx12:jevent:1.0") // Update with the latest version
```