package me.exerosis.event;

import java.util.Set;
import java.util.TreeSet;


public class GlobalEventManager {
    private static EventManager manager = new EventManager();

    private GlobalEventManager() {
    }

    public static void registerListener(EventListener<?, ?> listener) {
        manager.registerListener(listener);
    }

    public static void unregisterListener(EventListener listener) {
         manager.unregisterListener(listener);
    }

    public static <A, B> B fire(Class<A> listenerType, B event, EventExecutor<B> executor) {
         return manager.fire(listenerType, event, executor);
    }

    public static <B> B fire(B event, EventExecutor<B> executor) {
        return  manager.fire(event, executor);
    }

    public static <A, B> B fire(Class<A> listenerType, B event) {
        return manager.fire(listenerType, event, null);
    }

    public static <B> B fire(B event) {
        return manager.fire(event.getClass(), event, null);
    }
}
