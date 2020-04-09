package designpatterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaptainNotSynchronizedTest {

    @Test
    public void testCaptainNotSynchronized() {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        IntStream.range(1, 100).parallel().forEach(i -> executor.submit(() -> CaptainNotSynchronized.getCaptain()));
    }
}
