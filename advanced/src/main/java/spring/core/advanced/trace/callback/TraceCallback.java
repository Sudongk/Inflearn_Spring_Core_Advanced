package spring.core.advanced.trace.callback;

public interface TraceCallback<T> {
    T call();
}
