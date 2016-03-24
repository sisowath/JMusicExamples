package songs;

import static jm.constants.DrumMap.ACOUSTIC_BASS_DRUM;
import static jm.constants.DrumMap.COWBELL;
import static jm.constants.Durations.*;
import static jm.constants.Panning.*;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.FLUTE;
import static jm.constants.ProgramChanges.GUITAR;
import static jm.constants.ProgramChanges.PIANO;
import static jm.constants.Volumes.*;
import jm.music.data.*;
import jm.music.tools.Mod;
import jm.util.Play;
import jm.util.View;
import models.Mesure;

public class NoreEuhSreyNore {
    public static void main(String[] args) {
        Score score = new Score("Nore euh srey nore !");
        
        Part drums = new Part("Drums", 0, 9); // 9 = MIDI channel 10        
        Part flute = new Part("FLUTE", FLUTE,0);
        Part guitar = new Part(GUITAR, 1);
        Part piano = new Part(PIANO, 2);
        Part bass = new Part("ACOUSTIC_BASS", ACOUSTIC_BASS, 3);
        
        Phrase phraseFlute = new Phrase(0.0);
        Phrase phraseGuitar = new Phrase(0.0);
        CPhrase phraseChord = new CPhrase(0.0);
        Phrase phraseBass = new Phrase(0.0);
        Phrase phrBD = new Phrase(0.0);
        Phrase phrCB = new Phrase(0.0);
        Phrase phrCHH = new Phrase(0.0);
        
        Mesure mesuresFlute = new Mesure(phraseFlute);
        mesuresFlute.ajouter(new int[] {REST, A3, C4}, new double[] {DHN, EN, EN});
        for(int i=0; i < 2; i++) {
            mesuresFlute.ajouter(new int[] {D4, REST, C4, E4, G4}, new double[] {HN, EN, EN, EN, EN});
            mesuresFlute.ajouter(new int[] {D4, C4, A3, C4}, new double[] {DQN, EN, QN, QN});
            mesuresFlute.ajouter(new int[] {D4, C4, C4, E4, G4}, new double[] {QN, DQN, EN, EN, EN});
            if(i==0) {
                mesuresFlute.ajouter(new int[] {D4, REST, C4, A3, C4}, new double[] {DHN, EN, EN, EN, EN});            
            } else {
                mesuresFlute.ajouter(new int[] {D4, REST, E3, G3}, new double[] {HN, QN, EN, EN});            
            }
        }
        for(int i=0; i < 2; i++) {
            mesuresFlute.ajouter(new int[] {A3, C4, C4, A3, D4, C4}, new double[] {QN, QN, EN, EN, EN, EN});
            mesuresFlute.ajouter(new int[] {A3, G3, E3, G3}, new double[] {DQN, EN, QN, QN});
            mesuresFlute.ajouter(new int[] {A3, C4, A3, D4, C4}, new double[] {QN, DQN, EN, EN, EN});
            if(i == 0) {
                mesuresFlute.ajouter(new int[] {A3, REST, G3, E3, G3}, new double[] {HN, EN, EN, EN, EN});                                
            } else {
                mesuresFlute.ajouter(new int[] {A3, REST, A3, C4}, new double[] {DHN, EN, EN, EN});                                
            }
        }                
        
        for(int i=0; i < 2; i++) {
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(G5, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(G4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(G5, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E5, EN, F, PAN_LEFT));
            if(i==0) {
                phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
                phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            } else {
                phraseGuitar.add(new Note(E4, EN, F, PAN_LEFT));
                phraseGuitar.add(new Note(G4, EN, F, PAN_LEFT));    
            }
        }
        for(int i=0; i < 2; i++) {
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(G4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(E4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(G4, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(D5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));

            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
            phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));            
            if(i==0) {
                phraseGuitar.add(new Note(E4, EN, F, PAN_LEFT));
                phraseGuitar.add(new Note(G4, EN, F, PAN_LEFT));
            } else {
                phraseGuitar.add(new Note(A4, EN, F, PAN_LEFT));
                phraseGuitar.add(new Note(C5, EN, F, PAN_LEFT));    
            }
        }        
        phraseGuitar.setStartTime(WN);
        
        int[] accord = new int[3];
        for(int i=0; i < 2; i++) {
            if( i == 0) {
                accord[0] = REST;
                accord[1] = REST;
                accord[2] = REST;
                phraseChord.addChord(accord, WN);
            }
            for(int j=0; j < 4*8; j++) {                                
                accord[0] = REST;
                accord[1] = REST;
                accord[2] = REST;
                phraseChord.addChord(accord, EN);

                accord[0] = D4;
                accord[1] = F4;
                accord[2] = A4;
                phraseChord.addChord(accord, EN, 65);
            }  
            for(int j=0; j < 4*8; j++) {                
                accord[0] = REST;
                accord[1] = REST;
                accord[2] = REST;
                phraseChord.addChord(accord, EN);

                accord[0] = A3;
                accord[1] = C4;
                accord[2] = E4;
                phraseChord.addChord(accord, EN, 65);
            }
        }
        
        // Dm
        for(int i=0; i < 8; i++) {
            phraseBass.add(new Note(D1, DQN, F, PAN_CENTER));
            phraseBass.add(new Note(A1, EN, F, PAN_CENTER));
            phraseBass.add(new Note(D1, DQN, F, PAN_CENTER));
            phraseBass.add(new Note(A1, EN, F, PAN_CENTER));
        }
        // Am
        for(int i=0; i < 8; i++) {
            phraseBass.add(new Note(A1, DQN, F, PAN_CENTER));
            phraseBass.add(new Note(E2, EN, F, PAN_CENTER));
            phraseBass.add(new Note(A1, DQN, F, PAN_CENTER));
            phraseBass.add(new Note(E2, EN, F, PAN_CENTER));
        }
        
        // make bass drum
        for(int i=0;i<32;i++){
            Note note = new Note(ACOUSTIC_BASS_DRUM, DQN, FFF, PAN_LEFT);
            phrBD.addNote(note);                
            note = new Note(ACOUSTIC_BASS_DRUM, EN, FFF, PAN_LEFT);
            phrBD.addNote(note);                
        }
        
        // make cowbell
        for(int i=0; i < 64; i++) {
            Note note = new Note(COWBELL, QN, FF, PAN_RIGHT);
            phrCB.add(note);
        }
        
        // make closed hi hat
        for(int i=0; i < 128; i ++) {
            Note note = new Note(42, EN);
            phrCHH.add(note);
        }
        
        phrBD.setStartTime(4.0);
        phrCB.setStartTime(4.0);
        phrCHH.setStartTime(4.0);
        phraseBass.setStartTime(4.0);
        
        drums.add(phrBD);
        drums.add(phrCB);
        drums.add(phrCHH);                        
        
        //Mod.repeat(phraseChord, 7); NE JAMAIS REPETER DE CETTE FACON !!!
        Mod.repeat(phraseGuitar, 2);
        Mod.repeat(phraseBass, 2);        
        Mod.repeat(phrBD, 2);
        Mod.repeat(phrCB, 2);
        Mod.repeat(phrCHH, 2);
        
        Mod.transpose(phraseChord, 12);
        Mod.transpose(phraseFlute, 12);   
        Mod.transpose(phraseBass, 12);
        
        flute.add(phraseFlute);
        guitar.add(phraseGuitar);
        piano.addCPhrase(phraseChord);
        bass.add(phraseBass);  
        
        score.add(flute);
        score.add(guitar);
        score.add(piano);
        score.add(bass);
        score.add(drums);
        score.setTempo(135);
        
        //View.show(score);
        Play.midi(score);
    }
}