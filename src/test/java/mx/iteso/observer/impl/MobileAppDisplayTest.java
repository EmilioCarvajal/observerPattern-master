package mx.iteso.observer.impl;

import mx.iteso.observer.Scorerr;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;
    List<Scorerr> scorerrList;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        mobileAppDisplay = new MobileAppDisplay(scoresData);
        scorerrList = new ArrayList<Scorerr>();
    }

    @Test
    public void testUpdate() {
        mobileAppDisplay.update("homeTeam", "awayTeam", 1, 0,scorerrList);

    }
}
