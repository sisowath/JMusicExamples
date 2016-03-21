package songs;

import java.util.ArrayList;
import java.util.List;
import static jm.constants.DrumMap.ACOUSTIC_BASS_DRUM;
import static jm.constants.DrumMap.CLOSED_HI_HAT;
import static jm.constants.DrumMap.LOW_CONGA;
import static jm.constants.DrumMap.OPEN_HI_CONGA;
import static jm.constants.Durations.*;
import static jm.constants.Panning.PAN_CENTER;
import static jm.constants.Panning.PAN_LEFT;
import static jm.constants.Panning.PAN_RIGHT;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.FLUTE;
import static jm.constants.ProgramChanges.PIANO;
import static jm.constants.ProgramChanges.TRUMPET;
import static jm.constants.Volumes.*;
import jm.music.data.CPhrase;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import models.Mesure;
import models.StyleBassRoamvong;

public class OreSvayChanti {
    public static void main(String[] args) {
        Score score = new Score("Ore Svawy Chanti !");
        
        Part flute = new Part(FLUTE, 0);
        Part trumpet = new Part(TRUMPET, 1);
        Part piano = new Part(PIANO, 2);
        Part bass = new Part(ACOUSTIC_BASS, 3);
        Part drums = new Part("Drums", 0, 9);
        
        Phrase phraseFlute = new Phrase(0.0);
        Phrase phraseTrumpet = new Phrase(0.0);
        CPhrase phraseAccord = new CPhrase(0.0);
        Phrase phraseBass = new Phrase(0.0);        
        Phrase phraseDrumsAB = new Phrase(0.0);
        Phrase phraseDrumsCB = new Phrase(0.0);
        Phrase phraseDrumsLC = new Phrase(0.0);
        Phrase phraseDrumsOHC = new Phrase(0.0);
        Phrase phraseDrumsCHH = new Phrase(0.0);        
        
        Mesure mesuresFlute = new Mesure(phraseFlute);
        
        for(int i=0; i < 2; i++) {
            for(int j=0; j < 2; j++) {
                mesuresFlute.ajouter(new int[] {REST, E4, E4, E4}, new double[] {QN, QN, QN, QN});
                mesuresFlute.ajouter(new int[] {E4, G4, E4, D4}, new double[] {DQN, EN, QN, QN});
                mesuresFlute.ajouter(new int[] {C4, A3, C4, D4}, new double[] {DQN, EN, QN, QN});
                if(j == 0) {
                    mesuresFlute.ajouter(new int[] {E4, REST}, new double[] {DHN, QN});
                } else if(j == 1) {
                    mesuresFlute.ajouter(new int[] {E4, REST, C4}, new double[] {HN, QN, QN});
                }
            }
            for(int j=0; j < 2; j++) {
                mesuresFlute.ajouter(new int[] {D4, D4}, new double[] {HN, HN});
                mesuresFlute.ajouter(new int[] {D4, C4, A3, C4}, new double[] {DQN, EN, QN, QN});
                mesuresFlute.ajouter(new int[] {D4, G4, E4, D4}, new double[] {DQN, EN, QN, QN});
                if(j == 0) {
                    mesuresFlute.ajouter(new int[] {C4, REST, C4}, new double[] {HN, QN, QN});
                } else if(j == 1) {
                    mesuresFlute.ajouter(new int[] {C4, REST}, new double[] {DHN, QN});
                }
            }
        }
        //mesures.setVolume(P);
        
        //Mesure mesuresTrumpet = new Mesure(phraseTrumpet);
        phraseTrumpet.add(new Note(REST, DQN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(E4, EN));
        phraseTrumpet.add(new Note(D4, EN));
        phraseTrumpet.add(new Note(E4, HN));
        phraseTrumpet.add(new Note(REST, HN));
        phraseTrumpet.add(new Note(REST, WHOLE_NOTE*2));
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(E4, EN));
        phraseTrumpet.add(new Note(E4, DQN));
        phraseTrumpet.add(new Note(REST, EN));
        phraseTrumpet.add(new Note(REST, WHOLE_NOTE*3));
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(D4, EN));
        phraseTrumpet.add(new Note(C4, EN));
        phraseTrumpet.add(new Note(C4, DQN));
        phraseTrumpet.add(new Note(REST, EN));
        phraseTrumpet.add(new Note(REST, WN*3));
        phraseTrumpet.add(new Note(REST, DQN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(E4, EN));
        phraseTrumpet.add(new Note(D4, EN));
        phraseTrumpet.add(new Note(C4, HN));
        phraseTrumpet.add(new Note(REST, HN));
        phraseTrumpet.add(new Note(REST, WN*2));
        phraseTrumpet.setStartTime(12);
        
        int[] accord = new int[3];
        accord[0] = REST;
        accord[1] = REST;
        accord[2] = REST;
        phraseAccord.addChord(accord, WN);
        
        for(int i=0; i < 2; i++) {
            //C
            for(int j=0; j < 4*7; j++) {
                accord[0] = REST;
                accord[1] = REST;
                accord[2] = REST;
                phraseAccord.addChord(accord, EN);

                accord[0] = C4;
                accord[1] = E4;
                accord[2] = G4;
                phraseAccord.addChord(accord, EN, 65);
            }
            for(int j=0; j < 2; j++) {
                // Dm
                for(int k=0; k < 4*2; k++) {
                    accord[0] = REST;
                    accord[1] = REST;
                    accord[2] = REST;
                    phraseAccord.addChord(accord, EN, MF);

                    accord[0] = D4;
                    accord[1] = F4;
                    accord[2] = A4;
                    phraseAccord.addChord(accord, EN, MF);
                }
                // G
                for(int k=0; k < 4; k++) {
                    accord[0] = REST;
                    accord[1] = REST;
                    accord[2] = REST;
                    phraseAccord.addChord(accord, EN, MF);

                    accord[0] = G4;
                    accord[1] = B4;
                    accord[2] = D5;
                    phraseAccord.addChord(accord, EN, MF);
                }
                // C
                for(int k=0; k < 4; k++) {
                    accord[0] = REST;
                    accord[1] = REST;
                    accord[2] = REST;
                    phraseAccord.addChord(accord, EN, MF);

                    accord[0] = C4;
                    accord[1] = E4;
                    accord[2] = G4;
                    phraseAccord.addChord(accord, EN, MF);
                }
            }
            // C
            for(int j=0; j < 4; j++) {
                accord[0] = REST;
                accord[1] = REST;
                accord[2] = REST;
                phraseAccord.addChord(accord, EN, MF);

                accord[0] = C4;
                accord[1] = E4;
                accord[2] = G4;
                phraseAccord.addChord(accord, EN, MF);
            }
        }
        
        StyleBassRoamvong sbr = new StyleBassRoamvong(phraseBass);
        for(int i=0; i < 7; i ++) {
            sbr.ajouter(new int[] {C1, C1, G1, G1}, FF, PAN_CENTER);            
        }
        for(int i=0; i < 2; i++) {
            for(int j=0; j < 2; j++) {
                sbr.ajouter(new int[] {D1, D1, A1, A1}, FF, PAN_CENTER);
            }
            sbr.ajouter(new int[] {G1, G1, D2, D2}, FF, PAN_CENTER);            
            if(i == 0) {
                sbr.ajouter(new int[] {C1, C1, G1, G1},FF, PAN_CENTER);                        
            } else {
                for(int j=0; j < 2; j++) {
                sbr.ajouter(new int[] {C1, C1, G1, G1}, FF, PAN_CENTER);                                        
                }
            }
        }
        
        for(int i=0; i < 1; i++) {
            phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, DQN, FFF, PAN_LEFT));
            phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, DQN, FFF, PAN_LEFT));
            phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, QN, FFF, PAN_LEFT));
        }
        phraseDrumsAB.setStartTime(WN);
        
        for(int i=0; i < 2; i++) {
            phraseDrumsCB.add(new Note(56, HN, FF, PAN_RIGHT));
        }
        phraseDrumsCB.setStartTime(4.0);
                
        phraseBass.setStartTime(4.0);        
        
        for(int i=0; i < 1; i++) {
            phraseDrumsLC.add(new Note(REST, EN));
            phraseDrumsLC.add(new Note(REST, SN));
            phraseDrumsLC.add(new Note(LOW_CONGA, SN, FF));
            phraseDrumsLC.add(new Note(LOW_CONGA, EN, FF));
            phraseDrumsLC.add(new Note(LOW_CONGA, EN, FF));
            phraseDrumsLC.add(new Note(REST, HN));
        }
        phraseDrumsLC.setStartTime(4.0);     
        
        for(int i=0; i < 1; i++) {
            phraseDrumsOHC.add(new Note(REST, HN));
            phraseDrumsOHC.add(new Note(REST, EN));
            phraseDrumsOHC.add(new Note(OPEN_HI_CONGA, EN));
            phraseDrumsOHC.add(new Note(OPEN_HI_CONGA, QN));
        }
        phraseDrumsOHC.setStartTime(4.0);
        
        for(int i=0; i < 8; i ++) {
           phraseDrumsCHH.add(new Note(CLOSED_HI_HAT, EN));
        }
        phraseDrumsCHH.setStartTime(WHOLE_NOTE);
        
        Mod.repeat(phraseTrumpet, 2);
        Mod.repeat(phraseBass, 2);
        Mod.repeat(phraseDrumsAB, 16*2);
        Mod.repeat(phraseDrumsCB, 16*2);
        Mod.repeat(phraseDrumsLC, 16*2);
        Mod.repeat(phraseDrumsOHC, 16*2);
        Mod.repeat(phraseDrumsCHH, 16*2);
        
        Mod.transpose(phraseBass, 12);
        
        flute.add(phraseFlute);
        trumpet.add(phraseTrumpet);
        piano.addCPhrase(phraseAccord);
        bass.add(phraseBass);        
        
        drums.add(phraseDrumsAB);
        drums.add(phraseDrumsCB);
        drums.add(phraseDrumsLC);
        drums.add(phraseDrumsOHC);
        drums.add(phraseDrumsCHH);                        
        
        score.add(flute);
        score.add(trumpet);
        score.add(piano);
        score.add(bass);
        score.add(drums);
        score.setTempo(135);
        
        //View.show(score);
        Play.midi(score);
    }
}