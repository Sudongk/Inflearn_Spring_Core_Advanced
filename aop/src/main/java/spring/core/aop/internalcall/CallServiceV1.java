//package spring.core.aop.internalcall;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class CallServiceV1 {
//
//    private CallServiceV1 callServiceV1;
//
//    // 애플리케이션 컨텍스트 내의 일부 빈들이 순환 참조(cycle)를 형성한다.
//    // 순환 참조는 기본적으로 금지되며 권장되지 않는다.
//    // 순환 참조는 빈들 간의 의존성이 순환적으로 발생할 때 발생한다.
//    // 예를 들어, A 빈이 B 빈에 의존하고, B 빈이 다시 A 빈에 의존하는 상황이 순환 참조인데,
//    // 이런 경우 빈들을 초기화하는 동안 무한 루프가 발생할 수 있으며, 애플리케이션이 시작되지 않을 수 있다.
//
//    @Autowired
//    public void setCallServiceV1(CallServiceV1 callServiceV1) {
//        this.callServiceV1 = callServiceV1;
//    }
//
//    // 생성자는 쓰면 안 된다.
//
//    public void external() {
//        log.info("call external");
//        callServiceV1.internal();
//    }
//
//    public void internal() {
//        log.info("call internal");
//    }
//}
