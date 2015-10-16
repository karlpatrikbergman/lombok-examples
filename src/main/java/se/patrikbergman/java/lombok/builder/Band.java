package se.patrikbergman.java.lombok.builder;

import lombok.Builder;
import lombok.Value;

@Builder    //Generates builder
@Value      //Generates constructor and getters (Not setters)
class Band {
    String name;
    String description;
    int yearsActive;
}
