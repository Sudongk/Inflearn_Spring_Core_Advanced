package spring.core.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.core.proxy.config.AppV1Config;
import spring.core.proxy.config.AppV2Config;

@Import({AppV1Config.class, AppV2Config.class})
@SpringBootApplication(scanBasePackages = "spring.core.proxy.app")
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
    }

}
