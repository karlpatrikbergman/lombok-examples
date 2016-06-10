package se.patrikbergman.java.lombok.nonnull;

import org.junit.Test;

public class MemberNonNullAnnotationTest {

    @Test(expected = NullPointerException.class)
    public void test() {
        Member member = new Member(null);
    }
}
