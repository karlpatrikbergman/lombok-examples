package se.patrikbergman.java.lombok.nonnull;

import org.junit.Test;

public class BandNonNullAnnotationTest {

    @Test
    public void test() {
        Band band = Band.builder().name(null).build();
    }
}
