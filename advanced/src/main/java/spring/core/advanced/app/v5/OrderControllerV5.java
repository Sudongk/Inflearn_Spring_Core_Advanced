package spring.core.advanced.app.v5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.core.advanced.trace.callback.TraceTemplate;
import spring.core.advanced.trace.logtrace.LogTrace;

@RestController
public class OrderControllerV5 {

    private final OrderServiceV5 orderService;
    private final TraceTemplate template;

    public OrderControllerV5(OrderServiceV5 orderService, LogTrace trace) {
        this.orderService = orderService;
        this.template = new TraceTemplate(trace);
    }

    @GetMapping("/v5/request")
    public String request(String itemId) {
        return template.execute("OrderController.begin()",
                () -> {
                    orderService.orderItem(itemId);
                    return "ok";
                });
    }
}
