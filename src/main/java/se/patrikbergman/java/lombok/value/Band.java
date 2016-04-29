package se.patrikbergman.java.lombok.value;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

/**
 * When annotation field with @Getter(AccessLevel.NONE) it can be excluded, i.e is not created at all
 */
@Value
class Band {
    private final String name;
    private final String description;
    private final int rockFactor;
    @Getter(AccessLevel.NONE)
    private String secretValue;
}
