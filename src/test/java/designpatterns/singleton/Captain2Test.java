package designpatterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Captain2Test {

    @Test
    public void testCaptain2() {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        IntStream.range(1, 100).parallel().forEach(i -> executor.submit(() -> Captain2.getCaptain()));
    }
}
