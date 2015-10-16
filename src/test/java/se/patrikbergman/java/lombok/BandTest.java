package se.patrikbergman.java.lombok;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BandTest {
    Band band;

    //Given
    private final String expectedBandName = "Judas Priest";
    private final String expectedBandDescription = "German heavy metal band from the eighties";
    private final int expectedYearsActive = 35;

    @Test
    public void lombokValue() {
        //when
        band = new Band(expectedBandName, expectedBandDescription, expectedYearsActive);

        //then
        assertBandFields();
    }

    @Test
    public void lombokBuilder() {
        //when
        band = Band.builder()
                .name(expectedBandName)
                .description(expectedBandDescription)
                .yearsActive(expectedYearsActive)
                .build();

        //then
        assertBandFields();
    }

    private void assertBandFields() {
        assertEquals(band.getName(), expectedBandName);
        assertEquals(band.getDescription(), expectedBandDescription);
        assertEquals(band.getYearsActive(), expectedYearsActive);
    }
}
