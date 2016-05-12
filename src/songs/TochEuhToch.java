package songs;

import static jm.constants.Durations.*;
import jm.constants.Panning;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.FLUTE;
import static jm.constants.Volumes.FF;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import models.Mesure;
import models.RythmeRoamvong;
import models.StyleBassRoamvong;
import static songs.OmmToukKnongBeng.REPETITION;

public class TochEuhToch {
    
    public static final int REPETITION = 99;
    
    public static void main(String args[]) {
        Score score1 = new Score("Toch euh Toch");
        
        Part flute = new Part(FLUTE, 1);
        Phrase phraseFlute = new Phrase(0.0);
        Mesure mesureFlute = new Mesure(phraseFlute);
        for(int i=0; i < REPETITION; i++) {
            mesureFlute.ajouter(new int[] {A3, C4}, new double[] {HN, HN});
            if(i%2==0)
                mesureFlute.ajouter(new int[] {A3, C4, A3, C4, G3}, new double[] {DQN, EN, EN, EN, QN});
            else
                mesureFlute.ajouter(new int[] {A3, C4, A3, G3}, new double[] {DQN, EN, QN, QN});            
            if(i%2==0)
                mesureFlute.ajouter(new int[] {A3, C4, D4, D4, C4, D4, C4}, new double[] {DQN, EN, EN, TN, TN, SN, QN});
            else
                mesureFlute.ajouter(new int[] {A3, C4, D4, C4}, new double[] {DQN, EN, QN, QN});
            mesureFlute.ajouter(new int[] {E4, REST, A3, C4}, new double[] {HN+EN, EN, EN, EN});
            for(int j=0; j < 2; j++) {
                if(i%2==0)
                    if(j==0)
                        mesureFlute.ajouter(new int[] {D4, E4, A3, E4}, new double[] {DQN, EN, QN, QN});
                    else
                        mesureFlute.ajouter(new int[] {D4, D4, E4, D4, C4, A3, C4, D4, E4}, new double[] {QN, TN, TN, SN, EN, EN, SN, SN, QN});
                else
                    mesureFlute.ajouter(new int[] {D4, E4, A3, E4}, new double[] {DQN, EN, DQN, EN});
                mesureFlute.ajouter(new int[] {D4, E4, D4, C4}, new double[] {DQN, EN, QN, QN});
                if(i%2==0)
                    mesureFlute.ajouter(new int[] {B3, A3, B3, A3, B3, A3, G3}, new double[] {DQN, EN, EN, TN, TN, SN, QN});
                else
                    mesureFlute.ajouter(new int[] {B3, A3, B3, G3}, new double[] {DQN, EN, QN, QN});
                if(j==0)
                    mesureFlute.ajouter(new int[] {A3, REST, C4}, new double[] {HN+EN, EN, QN});
                else
                    mesureFlute.ajouter(new int[] {A3, REST}, new double[] {HN+EN, DQN});
            }
        }
        flute.add(phraseFlute);
        Mod.transpose(flute, +12);
        score1.add(flute);
        
        Part drums = new Part("Drums", 0, 9);
        RythmeRoamvong ryhRoavong = new RythmeRoamvong(drums);        
        score1.add(drums);
        Mod.repeat(drums, 12*REPETITION);
        
        Part bass = new Part(ACOUSTIC_BASS, 2);
        Phrase phraseBass = new Phrase(0.0);
        StyleBassRoamvong styleBassRoamvong = new StyleBassRoamvong(phraseBass);
        for(int i=0; i < REPETITION; i++) {
            for(int j=0; j<3; j++)
                styleBassRoamvong.ajouter(new int[] {A1, A1, E2, E2}, FF, Panning.PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {E1, E1, B1, B1}, FF, Panning.PAN_CENTER);
            for(int j=0; j<2; j++)
                styleBassRoamvong.ajouter(new int[] {D1, D1, A1, A1}, FF, Panning.PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {E1, E1, B1, B1}, FF, Panning.PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {A1, A1, E2, E2}, FF, Panning.PAN_CENTER);        
            for(int j=0; j<2; j++)
                styleBassRoamvong.ajouter(new int[] {D2, D2, A2, A2}, FF, Panning.PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {E1, E1, B1, B1}, FF, Panning.PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {A1, A1, E2, E2}, FF, Panning.PAN_CENTER);        
        }
        bass.add(phraseBass);
        score1.add(bass);
        
        score1.setTempo(145);
        Play.midi(score1);
    }
}
