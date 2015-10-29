package me.exerosis.event;

public interface EventExecutor<T> {
    void execute(T event);
}