package se.patrikbergman.java.lombok.nonnull;

import lombok.*;

/**
 * With @NonNull on field "name", NullpointerException is thrown
 * if name parameter is null. Without @NonNull no exception is thrown
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
@EqualsAndHashCode
class Band {
    @NonNull String name;
}
