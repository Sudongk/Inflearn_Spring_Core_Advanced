package spring.core.aop.internalcall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import spring.core.aop.internalcall.aop.CallLogAspect;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(CallLogAspect.class)
class CallServiceV0Test {

    // 애플리케이션 컨텍스트 내의 일부 빈들이 순환 참조(cycle)를 형성한다.
    // 순환 참조는 기본적으로 금지되며 권장되지 않는다.
    @Autowired
    private CallServiceV0 callServiceV0;

    @Test
    void external() {
        callServiceV0.external();
    }

    @Test
    void internal() {
        callServiceV0.internal();
    }
}