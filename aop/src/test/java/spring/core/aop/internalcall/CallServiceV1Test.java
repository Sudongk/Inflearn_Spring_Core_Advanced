//package spring.core.aop.internalcall;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import spring.core.aop.internalcall.aop.CallLogAspect;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@SpringBootTest
//@Import(CallLogAspect.class)
//class CallServiceV1Test {
//
//    @Autowired
//    CallServiceV1 callServiceV1;
//
//    // 순환 참조로 인해 테스트 실패
//    @Test
//    void external() {
//        callServiceV1.external();
//    }
//
//    @Test
//    void internal() {
//        callServiceV1.internal();
//    }
//
//}