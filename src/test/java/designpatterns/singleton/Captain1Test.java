package designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Captain1Test {

    /**
     * No object is created when only calling dummy method
     */
    @Test
    public void testCaptain1NotCreated() {
        Captain1.dummyMethod();
    }


    /**
     * One single object is created when calling static get method
     */
    @Test
    public void testCaptain1Created() {
        Captain1 captain1 = Captain1.getCaptain();
        Captain1 captain2 = Captain1.getCaptain();
        Assertions.assertTrue(captain1 == captain2);
    }

}
