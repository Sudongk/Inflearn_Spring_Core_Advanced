package spring.core.proxy.config.interface_proxy;

import lombok.RequiredArgsConstructor;
import spring.core.proxy.app.v1.OrderServiceV1;
import spring.core.proxy.trace.TraceStatus;
import spring.core.proxy.trace.logtrace.LogTrace;

@RequiredArgsConstructor
public class OrderServiceInterfaceProxy implements OrderServiceV1 {

    private final OrderServiceV1 target;
    private final LogTrace logTrace;

    @Override
    public void orderItem(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderService.orderItem()");
            target.orderItem(itemId);
            logTrace.end(status);
        } catch (Exception e) {
            logTrace.exception(status, e);
        }
    }

}
