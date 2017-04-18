import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by I062070 on 18/04/2017.
 */
public class SeasonTest {
    @Test
    public void fromDateIsAfterToDate_givenDateIsBeforeToDate() throws Exception {
        Season season = new Season(8, 1, 7, 30);
        assertThat(season.in(7, 1), is(true));
    }

    @Test
    public void fromDateIsAfterToDate_givenDateIsAfterToDateAndBeforeGivenDate() throws Exception {
        Season season = new Season(8, 1, 6, 1);
        assertThat(season.in(7, 1), is(false));
    }

    @Test
    public void fromIsAfterTo_givenDateIsAfterFromDate() throws Exception {
        Season season = new Season(8, 1, 7, 30);
        assertThat(season.in(8, 2), is(true));
    }

    @Test
    public void fromDateIsBeforeToDate_givenDateIsBeforeFromDate() throws Exception {
        Season season = new Season(6, 1, 7, 30);
        assertThat(season.in(7, 14), is(false));
    }

    @Test
    public void fromDateIBeforeToDate_givenDateIsAfterToDate_andGivenDateIsAfterFromDate() throws Exception {
        Season season = new Season(6, 1, 7, 30);
        assertThat(season.in(8, 14), is(false));
    }

    @Test
    public void fromDateIsBeforeToDate_givenDateIsBeforeToDate_andGivenDateIsAfterFromDate() throws Exception {
        Season season = new Season(6, 1, 7, 30);
        assertThat(season.in(7, 14), is(false));
    }
}