package songs;

import static jm.constants.Durations.*;
import static jm.constants.Panning.*;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.FLUTE;
import static jm.constants.Volumes.*;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import models.Mesure;
import models.StyleBassSaravan;
import models.StyleSaravan;

public class EuhKomphemTengKloun {
    public static void main(String args[]) {
        Score score = new Score("Euh Komphem Kromom teng kloun !");
        Part flute = new Part(FLUTE, 0);
        Part drums = new Part("Drums", 0, 9);
        Part bass = new Part(ACOUSTIC_BASS, 2);
        new StyleSaravan(drums);
        
        Phrase phraseFlute = new Phrase(0.0);
        Phrase phraseBass = new Phrase(0.0);
        
        Mesure mesures = new Mesure(phraseFlute);
        mesures.ajouter(new int[] {REST, A4, E5}, new double[] {HN, DQN, EN});
        for(int i=0; i < 2; i++) {
            mesures.ajouter(new int[] {E5, A4, C5, D5}, new double[] {DQN, EN, QN, QN});
            mesures.ajouter(new int[] {E5, A4, E5}, new double[] {HN, DQN, EN});
            mesures.ajouter(new int[] {D5, A4, C5, D5, C5}, new double[] {DQN, EN, QN, EN, EN});
            if(i == 0 ) {
                mesures.ajouter(new int[] {D5, A4, E5}, new double[] {HN, DQN, EN});            
            } else {
                mesures.ajouter(new int[] {D5, E5, G5, E5, D5}, new double[] {HN, EN, EN, EN, EN, EN});            
            }
        }
        mesures.ajouter(new int[] {C5, D5, A4, C5, D5}, new double[] {QN, EN, EN, QN, QN});
        mesures.ajouter(new int[] {A4, C5, D5}, new double[] {HN, DQN, EN});
        mesures.ajouter(new int[] {A4, G4, E4, D4}, new double[] {QN, QN, QN, QN});
        mesures.ajouter(new int[] {E4, C4, D4}, new double[] {HN, DQN, EN});
        mesures.ajouter(new int[] {E4, G4, E4, D4}, new double[] {DQN, EN, QN, QN});
        mesures.ajouter(new int[] {C4, G4, A4}, new double[] {HN, DQN, EN});
        mesures.ajouter(new int[] {B4, C5, B4, A4, B4, C5}, new double[] {EN, EN, EN, EN, QN, QN});
        mesures.ajouter(new int[]{D5, A4, E5}, new double[] {HN, DQN, EN});
        mesures.ajouter(new int[] {D5, E5, D5, C5, A4, C5, G4, C5}, new double[] {EN, EN, EN, EN, EN, EN, EN, EN});
        mesures.ajouter(new int[] {A4, A4, E5}, new double[] {HN, DQN, EN});        
        flute.add(phraseFlute);
        
        StyleBassSaravan sbs = new StyleBassSaravan(phraseBass);
        for(int i=0; i < 2; i++) {
            for(int j=0; j< 2; j++) {
                sbs.ajouter(new int[] {A1, G1, G1, A1, G1, E1}, FF, PAN_CENTER);            
            }
            for(int j=0; j< 2; j++) {
                sbs.ajouter(new int[] {D2, C2, C2, D2, C2, A1}, FF, PAN_CENTER);            
            }
        }
        //sbs.ajouter(new int[] {C2, AS1, AS1, C2, AS1, G1}, FF, PAN_CENTER);            
        for(int i=0; i < 2; i++) {
            sbs.ajouter(new int[] {A1, G1, G1, A1, G1, E1}, FF, PAN_CENTER);                        
        }
        sbs.ajouter(new int[] {F1, D1, D1, F1, D1, C1}, FF, PAN_CENTER);            
        //sbs.ajouter(new int[] {D2, C2, C2, D2, C2, A1}, FF, PAN_CENTER);                    
        for(int i=0; i < 2; i ++) {
            sbs.ajouter(new int[] {E2, D2, D2, E2, D2, B1}, FF, PAN_CENTER);                    
        }
        sbs.ajouter(new int[] {C2, A1, A1, C2, A1, G1}, FF, PAN_CENTER);            
        sbs.ajouter(new int[] {G1, F1, F1, G1, F1, D1}, FF, PAN_CENTER);                    
        for(int i=0; i < 2; i ++) {
            sbs.ajouter(new int[] {D2, C2, C2, D2, C2, A1}, FF, PAN_CENTER);                    
        }
        sbs.ajouter(new int[] {A1, G1, G1, A1, G1, E1}, FF, PAN_CENTER);            
        phraseBass.setStartTime(WN);
        bass.add(phraseBass);
        
        score.add(flute);
        score.add(bass);
        score.add(drums);
        
        Mod.repeat(drums, 18);
        
        score.setTempo(110);
        Play.midi(score);
    }
}