package spring.core.advanced.app.v3;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import spring.core.advanced.trace.TraceStatus;
import spring.core.advanced.trace.logtrace.LogTrace;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV3 {
    private final LogTrace trace;

    public void save(String itemId) {
        TraceStatus status = null;
        try {
            status = trace.begin("OrderRepository.begin()");

            if (itemId.equals("ex")) {
                throw new IllegalStateException("예외 발생");
            }
            sleep(1000);

            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
