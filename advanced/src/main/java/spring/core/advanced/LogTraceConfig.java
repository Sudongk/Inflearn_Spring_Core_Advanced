package spring.core.advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.core.advanced.trace.logtrace.FieldLogTrace;
import spring.core.advanced.trace.logtrace.LogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
