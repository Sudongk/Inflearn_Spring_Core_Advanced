package spring.core.proxy.config.interface_proxy;

import lombok.RequiredArgsConstructor;
import spring.core.proxy.app.v1.OrderRepositoryV1;
import spring.core.proxy.trace.TraceStatus;
import spring.core.proxy.trace.logtrace.LogTrace;

@RequiredArgsConstructor
public class OrderRepositoryInterfaceProxy implements OrderRepositoryV1 {

    private final OrderRepositoryV1 target;
    private final LogTrace logTrace;

    @Override
    public void save(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderRepository.request()");
            target.save(itemId);
            logTrace.end(status);
        } catch (Exception e) {
            logTrace.exception(status, e);
        }
    }

}
