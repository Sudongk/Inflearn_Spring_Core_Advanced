package spring.core.proxy.trace.callback;

public interface TraceCallback<T> {
    T call();
}
