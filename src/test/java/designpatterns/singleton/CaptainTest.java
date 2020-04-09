package designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaptainTest {

    @Test
    public void testCaptainIsSingleton() {
        Captain captain1 = Captain.getCaptain();
        Captain captain2 = Captain.getCaptain();
        assertTrue(captain1 == captain2);
    }
}
