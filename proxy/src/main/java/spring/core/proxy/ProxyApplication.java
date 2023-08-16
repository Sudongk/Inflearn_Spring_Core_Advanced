package spring.core.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import spring.core.proxy.config.AppV1Config;
import spring.core.proxy.config.AppV2Config;
import spring.core.proxy.config.v1_proxy.ConcreteProxyConfig;
import spring.core.proxy.config.v1_proxy.InterfaceProxyConfig;
import spring.core.proxy.config.v2_dynamicproxy.DynamicProxyFilterConfig;
import spring.core.proxy.trace.logtrace.LogTrace;
import spring.core.proxy.trace.logtrace.ThreadLocalLogTrace;

//@Import({AppV1Config.class, AppV2Config.class})
//@Import(InterfaceProxyConfig.class)
//@Import(ConcreteProxyConfig.class)
@Import(DynamicProxyFilterConfig.class)
@SpringBootApplication(scanBasePackages = "spring.core.proxy.app")
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
    }

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }

}
