package songs;

import java.util.ArrayList;
import java.util.List;
import static jm.constants.DrumMap.ACOUSTIC_BASS_DRUM;
import static jm.constants.DrumMap.ELECTRIC_SNARE;
import static jm.constants.Durations.*;
import static jm.constants.Pitches.*;
import static jm.constants.ProgramChanges.ACOUSTIC_BASS;
import static jm.constants.ProgramChanges.SAXOPHONE;
import static jm.constants.ProgramChanges.TRUMPET;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;

public class OreKumpirgnPouyEuh {
    public static void main(String[] args) {
        Score score = new Score("Ore Kumpirgn Pouy Euh !");
        
        Part saxophone = new Part("SAXOPHONE", SAXOPHONE, 0);
        Part trumpet = new Part(TRUMPET, 1);
        Part bass = new Part("Bass", ACOUSTIC_BASS, 2);
        Part drums = new Part("Drums", 0, 9);
        
        Phrase phraseSaxophone = new Phrase(0.0);
        Phrase phraseTrumpet = new Phrase(0.0);
        Phrase phraseBass = new Phrase(0.0);
        Phrase phraseSnare = new Phrase(0.0);
       
        List<Integer> melodyNoteList = new ArrayList<Integer>();
        for(int i=0; i < 2; i ++) {
            melodyNoteList.add(REST);
            melodyNoteList.add(B4);
            melodyNoteList.add(A4);
            melodyNoteList.add(G4);
            melodyNoteList.add(E4);
            melodyNoteList.add(D4);
            melodyNoteList.add(E4);
            melodyNoteList.add(G4);
            melodyNoteList.add(A4);
            melodyNoteList.add(REST);
            melodyNoteList.add(G4);
            melodyNoteList.add(B4);
            melodyNoteList.add(D5);
            melodyNoteList.add(A4);
            melodyNoteList.add(G4);
            melodyNoteList.add(B4);
            melodyNoteList.add(D5);
            melodyNoteList.add(A4);
            melodyNoteList.add(B4);
            melodyNoteList.add(A4);
            melodyNoteList.add(G4);
            melodyNoteList.add(E4);
            melodyNoteList.add(REST);
        }
        for(int i=0; i < 2; i ++) {
            melodyNoteList.add(REST);
            melodyNoteList.add(A4);
            melodyNoteList.add(C5);
            melodyNoteList.add(D5);
            melodyNoteList.add(E5);
            melodyNoteList.add(C5);
            melodyNoteList.add(D5);            
            melodyNoteList.add(REST);
            melodyNoteList.add(C5);
            melodyNoteList.add(E5);
            melodyNoteList.add(G5);
            melodyNoteList.add(D5);
            melodyNoteList.add(E5);
            melodyNoteList.add(D5);
            melodyNoteList.add(C5);
            melodyNoteList.add(B4);
            melodyNoteList.add(A4);
            melodyNoteList.add(B4);
            melodyNoteList.add(G4);
            melodyNoteList.add(A4);
            melodyNoteList.add(REST);
        }
        int[] melodyNoteArray = new int[melodyNoteList.size()];
        for(int i=0; i < melodyNoteList.size(); i++) {
            melodyNoteArray[i] = melodyNoteList.get(i);
        }
        
        List<Double> melodyNoteDurationList = new ArrayList<Double>();
        for(int i=0; i < 2; i++) {
            for(int j=0; j < 8; j++)
                melodyNoteDurationList.add(EN);
            melodyNoteDurationList.add(HN);
            for(int j=0; j < 4; j++)
                melodyNoteDurationList.add(EN);
            for(int j=0; j < 8; j++)
                melodyNoteDurationList.add(EN);
            melodyNoteDurationList.add(DHN);
            melodyNoteDurationList.add(QN);
        }
        for(int i=0; i < 2; i++) {
            melodyNoteDurationList.add(QN);
            melodyNoteDurationList.add(QN);
            for(int j=0; j < 4; j++)
                melodyNoteDurationList.add(EN);            
            melodyNoteDurationList.add(HN);
            for(int j=0; j < 4; j++)
                melodyNoteDurationList.add(EN);
            for(int j=0; j < 8; j++)
                melodyNoteDurationList.add(EN);
            melodyNoteDurationList.add(DHN);
            melodyNoteDurationList.add(QN);
        }
        double[] melodyNoteDurationArray = new double[melodyNoteDurationList.size()];
        for(int i=0; i < melodyNoteDurationList.size(); i++) {
            melodyNoteDurationArray[i] = melodyNoteDurationList.get(i);
        }
        
        //phraseTrumpet.setStartTime(WHOLE_NOTE);
        phraseTrumpet.add(new Note(REST, WN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(B4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(A4, QN));
        phraseTrumpet.add(new Note(REST, QN));
        
        phraseTrumpet.add(new Note(REST, WN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(A4, DEN));
        phraseTrumpet.add(new Note(G4, SN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(B4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(G4, EN));                
        phraseTrumpet.add(new Note(E4, QN));
        phraseTrumpet.add(new Note(REST, DHN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(B4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(A4, QN));
        phraseTrumpet.add(new Note(REST, QN));
        
        phraseTrumpet.add(new Note(REST, WN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(A4, DEN));
        phraseTrumpet.add(new Note(G4, SN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(B4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(G4, EN));                
        phraseTrumpet.add(new Note(A4, QN));
        phraseTrumpet.add(new Note(REST, DHN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(E5, EN));
        phraseTrumpet.add(new Note(D5, EN));
        phraseTrumpet.add(new Note(D5, QN));
        phraseTrumpet.add(new Note(REST, QN));
        
        phraseTrumpet.add(new Note(REST, WN));
        
        phraseTrumpet.add(new Note(REST, HN));
        phraseTrumpet.add(new Note(C5, EN));
        phraseTrumpet.add(new Note(B4, EN));
        phraseTrumpet.add(new Note(A4, EN));
        phraseTrumpet.add(new Note(G4, EN));
        phraseTrumpet.add(new Note(A4, QN));
        phraseTrumpet.add(new Note(REST, DHN));
        
        phraseTrumpet.add(new Note(REST, QN));
        phraseTrumpet.add(new Note(E5, EN));
        phraseTrumpet.add(new Note(D5, EN));
        phraseTrumpet.add(new Note(D5, QN));
        phraseTrumpet.add(new Note(REST, QN));
        
        phraseTrumpet.add(new Note(REST, WN));
        
        for(int i=0; i < 2; i++) {
            phraseBass.add(new Note(A2, DQN));
            phraseBass.add(new Note(E2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(A2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(E2, EN));
        }        
        for(int i=0; i < 2; i++) {
            phraseBass.add(new Note(E2, DQN));
            phraseBass.add(new Note(B1, EN));
            phraseBass.add(new Note(D2, EN));
            phraseBass.add(new Note(E2, EN));
            phraseBass.add(new Note(D2, EN));
            phraseBass.add(new Note(B1, EN));
        }
        for(int i=0; i < 2; i++) {
            phraseBass.add(new Note(A2, DQN));
            phraseBass.add(new Note(E2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(A2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(E2, EN));
        }        
        for(int i=0; i < 1; i++) {
            phraseBass.add(new Note(E2, DQN));
            phraseBass.add(new Note(B1, EN));
            phraseBass.add(new Note(D2, EN));
            phraseBass.add(new Note(E2, EN));
            phraseBass.add(new Note(D2, EN));
            phraseBass.add(new Note(B1, EN));
        }
        for(int i=0; i < 1; i++) {
            phraseBass.add(new Note(A2, DQN));
            phraseBass.add(new Note(E2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(A2, EN));
            phraseBass.add(new Note(G2, EN));
            phraseBass.add(new Note(E2, EN));
        }        
        for(int i=0; i < 2; i++) {
            for(int j=0; j < 2; j++) {
                phraseBass.add(new Note(D2, DQN));
                phraseBass.add(new Note(A1, EN));
                phraseBass.add(new Note(C2, EN));
                phraseBass.add(new Note(D2, EN));
                phraseBass.add(new Note(C2, EN));
                phraseBass.add(new Note(A1, EN));
            }
            for(int j=0; j < 2; j++) {
                phraseBass.add(new Note(A2, DQN));
                phraseBass.add(new Note(E2, EN));
                phraseBass.add(new Note(G2, EN));
                phraseBass.add(new Note(A2, EN));
                phraseBass.add(new Note(G2, EN));
                phraseBass.add(new Note(E2, EN));
            }
        }
        phraseBass.setStartTime(WHOLE_NOTE);
        
        for(int i=0; i < 1; i++) {
            phraseSnare.add(new Note(ACOUSTIC_BASS_DRUM, QN));
            phraseSnare.add(new Note(ELECTRIC_SNARE, QN));
            phraseSnare.add(new Note(ACOUSTIC_BASS_DRUM, EN));
            phraseSnare.add(new Note(ACOUSTIC_BASS_DRUM, EN));
            phraseSnare.add(new Note(ELECTRIC_SNARE, QN));
        }
        phraseSnare.setStartTime(WHOLE_NOTE);
        
        phraseSaxophone.addNoteList(melodyNoteArray, melodyNoteDurationArray);
        
        saxophone.add(phraseSaxophone);
        trumpet.add(phraseTrumpet);
        bass.add(phraseBass);
        drums.add(phraseSnare);
        
        score.add(saxophone);
        score.add(trumpet); 
        score.add(bass);
        score.add(drums);
        score.setTempo(110);
        
        //Mod.transpose(phrase, 12);
        Mod.repeat(phraseSnare, 15);
        
        Play.midi(score);
    }
}