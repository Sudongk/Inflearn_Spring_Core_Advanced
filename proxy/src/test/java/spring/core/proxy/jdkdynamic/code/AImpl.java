package spring.core.proxy.jdkdynamic.code;


public class AImpl implements AInterface {
    @Override
    public String call() {
        return "callA";
    }
}
