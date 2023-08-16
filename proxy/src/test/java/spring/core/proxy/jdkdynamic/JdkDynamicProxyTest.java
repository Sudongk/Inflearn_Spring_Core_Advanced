package spring.core.proxy.jdkdynamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import spring.core.proxy.jdkdynamic.code.*;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA() {
        AInterface target = new AImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        AInterface proxy = AInterface.class.cast(
                Proxy.newProxyInstance(AInterface.class.getClassLoader(),
                        new Class[]{AInterface.class},
                        handler));
        proxy.call();
    }

    @Test
    void dynamicB() {
        BInterface target = new BImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        BInterface proxy = BInterface.class.cast(
                Proxy.newProxyInstance(BInterface.class.getClassLoader(),
                        new Class[]{BInterface.class},
                        handler));
        proxy.call();
    }

}
