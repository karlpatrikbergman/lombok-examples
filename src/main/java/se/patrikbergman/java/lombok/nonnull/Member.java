package se.patrikbergman.java.lombok.nonnull;

import lombok.NonNull;

/**
 * With @NonNull we get NullpointerException during initialization object with argument name=null.
 * Without @NonNull no NullpointerException.
 */
class Member {
    private final String name;

    Member(@NonNull String name) {
        this.name = name;
    }
}
