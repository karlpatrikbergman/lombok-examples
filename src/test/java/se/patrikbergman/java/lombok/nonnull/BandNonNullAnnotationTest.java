package se.patrikbergman.java.lombok.nonnull;

import org.junit.Test;

public class BandNonNullAnnotationTest {

    @Test(expected = NullPointerException.class)
    public void test() {
        Band.builder().name(null).build();
    }
}
