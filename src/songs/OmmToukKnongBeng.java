package songs;

import static jm.constants.Durations.*;
import jm.constants.Panning;
import static jm.constants.Panning.PAN_CENTER;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.FLUTE;
import static jm.constants.ProgramChanges.PIANO;
import static jm.constants.Volumes.FF;
import jm.music.data.CPhrase;
import static jm.music.data.Note.REST;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import models.Mesure;
import models.RythmeRoamvong;
import models.StyleBassRoamvong;

/**
 *
 * @author Emanresu
 */
public class OmmToukKnongBeng {
    
    public static final int REPETITION = 99;
    
    public static void main(String args[]) {
        Score score = new Score("Omm Touk, Omm Touk Knong Beng");
        
        Part flute = new Part(FLUTE, 0);
        Phrase phraseFlute = new Phrase(0.0);
        Mesure mesureFlute = new Mesure(phraseFlute);        
        mesureFlute.ajouter(new int[] { REST, E3}, new double[] {DHN, QN});
        for(int i=0; i < REPETITION; i++) {
            mesureFlute.ajouter(new int[] {G3, E3, G3, E3}, new double[] {DQN, EN, QN, QN});
            mesureFlute.ajouter(new int[] {E3, G3, D3, C3}, new double[] {DQN, EN, DQN, EN});
            mesureFlute.ajouter(new int[] {A2, C3, D3, G3}, new double[] {DQN, EN, QN, QN});
            mesureFlute.ajouter(new int[] {E3, REST, C3}, new double[] {HN+EN, EN, QN});
            for(int j=0; j < 2; j++) {
                if(i%2==0) {
                    mesureFlute.ajouter(new int[] {D3, E3, D3, C3, A2, C3}, new double[] {EN, EN, EN, EN, QN, QN});                    
                } else {
                    mesureFlute.ajouter(new int[] {D3, C3, A2, C3}, new double[] {DQN, EN, QN, QN});                
                }
                mesureFlute.ajouter(new int[] {D3, C3, E3, D3, C3}, new double[] {QN, EN, EN, QN, QN});
                mesureFlute.ajouter(new int[] {B2, A2, B2, G2, A2, A2}, new double[] {EN, EN, EN, EN, QN, QN});
                if(j == 0) {
                    mesureFlute.ajouter(new int[] {A2, REST, C3}, new double[] {HN+EN, EN, QN});
                } else {
                    mesureFlute.ajouter(new int[] {A2, REST, E3}, new double[] {HN+EN, EN, QN});
                }
            }
        }
        flute.add(phraseFlute);        
        score.add(flute);
        Mod.transpose(flute, +12);
        
        Part drums = new Part("Drums", 0, 9);
        RythmeRoamvong ryhRoavong = new RythmeRoamvong(drums);        
        score.add(drums);
        Mod.repeat(drums, REPETITION);
        
        Part bass = new Part(ACOUSTIC_BASS, 1);
        Phrase phraseBass = new Phrase(0.0);
        StyleBassRoamvong styleBassRoamvong = new StyleBassRoamvong(phraseBass);
        for(int i=0; i < 2; i++)
            styleBassRoamvong.ajouter(new int[] {C1, C1, G1, G1}, FF, PAN_CENTER);
        styleBassRoamvong.ajouter(new int[] {A1, A1, E2, E2}, FF, PAN_CENTER);
        styleBassRoamvong.ajouter(new int[] {C1, C1, G1, G1}, FF, PAN_CENTER);
        for(int i=0; i < 2; i++) {
            styleBassRoamvong.ajouter(new int[] {D1, D1, A1, A1}, FF, PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {D1, D1, A1, A1}, FF, PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {G1, G1, D2, D2}, FF, PAN_CENTER);
            styleBassRoamvong.ajouter(new int[] {A1, A1, E2, E2}, FF, PAN_CENTER);
        }
        phraseBass.setStartTime(WN);
        bass.add(phraseBass);
        score.add(bass);
        Mod.repeat(bass, REPETITION);
        Mod.transpose(bass, +12);
        
        Part piano = new Part(PIANO, 2);
        int[] accord = new int[3];
        accord[0] = REST;
        accord[1] = REST;
        accord[2] = REST;
        CPhrase phraseAccord = new CPhrase(0.0);
        phraseAccord.addChord(accord, WN);
        for(int i=0; i < REPETITION; i++) {
            for(int j=0; j < 2*4; j++) {
                accord[0] = REST;accord[1] = REST;accord[2] = REST;
                phraseAccord.addChord(accord, EN);
                accord[0] = C4;
                accord[1] = E4;
                accord[2] = G4;
                phraseAccord.addChord(accord, EN, 65);
            }
            for(int j=0; j < 4; j++) {
                accord[0] = REST;accord[1] = REST;accord[2] = REST;
                phraseAccord.addChord(accord, EN);
                accord[0] = A3;
                accord[1] = C4;
                accord[2] = E4;                
                phraseAccord.addChord(accord, EN, 65);
            }            
            for(int j=0; j < 4; j++) {
                accord[0] = REST;accord[1] = REST;accord[2] = REST;
                phraseAccord.addChord(accord, EN);
                accord[0] = C4;
                accord[1] = E4;
                accord[2] = G4;
                phraseAccord.addChord(accord, EN, 65);    
            }                
            for(int j=0; j < 2; j++) {
                for(int k=0; k < 2*4; k++) {
                    accord[0] = REST;accord[1] = REST;accord[2] = REST;
                    phraseAccord.addChord(accord, EN);
                    accord[0] = D4;
                    accord[1] = F4;
                    accord[2] = A4;
                    phraseAccord.addChord(accord, EN, 65);
                }
                for(int k=0; k < 4; k++) {
                    accord[0] = REST;accord[1] = REST;accord[2] = REST;
                    phraseAccord.addChord(accord, EN);
                    accord[0] = G3;
                    accord[1] = B3;
                    accord[2] = D4;
                    phraseAccord.addChord(accord, EN, 65);
                }
                for(int k=0; k < 4; k++) {
                    accord[0] = REST;accord[1] = REST;accord[2] = REST;
                    phraseAccord.addChord(accord, EN);
                    accord[0] = A3;
                    accord[1] = C4;
                    accord[2] = E4;
                    phraseAccord.addChord(accord, EN, 65);
                }
            }
        }
        piano.addCPhrase(phraseAccord);
        score.add(piano);        
        
        score.setTempo(145);
        Play.midi(score);
    }
}