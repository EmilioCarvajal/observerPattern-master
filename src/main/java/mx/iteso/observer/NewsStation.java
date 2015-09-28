package mx.iteso.observer;

import mx.iteso.observer.impl.MobileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        List<Scorerr> scoresTacitKnowledgeIntel = new ArrayList<Scorerr>();
        List<Scorerr> scoresChivasQueretaro = new ArrayList<Scorerr>();
        List<Scorerr> scoresLagangaMueblesameria = new ArrayList<Scorerr>();

        scoresTacitKnowledgeIntel.add(new Scorerr("Ray","Defensa",7, "Tacit Knowledge"));
        scoresTacitKnowledgeIntel.add(new Scorerr("Abraham","Goal Keeper",1, "Intel"));

        scoresChivasQueretaro.add(new Scorerr("Omar Bravo","Forward",9, "Chivas"));
        scoresChivasQueretaro.add(new Scorerr("Emilio","Goal Keeper",10, "Tacit Knowledge"));




        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1,scoresTacitKnowledgeIntel);
        scoresData.setScore("Chivas", "Queretaro", 2, 1,scoresChivasQueretaro);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0,scoresLagangaMueblesameria);
    }
}
