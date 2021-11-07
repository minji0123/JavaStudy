package ch09.tryWithResourcesExample;

public class AutoCloseableObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseableObj 클래스 : closing...");
    }
}
