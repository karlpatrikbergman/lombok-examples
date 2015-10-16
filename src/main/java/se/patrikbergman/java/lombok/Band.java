package se.patrikbergman.java.lombok;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Band {
    String name;
    String description;
    int yearsActive;
}
