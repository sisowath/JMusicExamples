package controller;

import jm.JMC;
import static jm.constants.Pitches.D2;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Write;

public final class RandomRhythm implements JMC{
    public static void main(String[] args){
        Score score = new Score("JMDemo - Random Rhythm");
        Part inst = new Part("Snare", 0, 9);
        Phrase phr = new Phrase(0.0); 
        
        // create a phrase of random durations up to a semibreve in length.
        for(int i=0; i<24; i++){
                Note note = new Note(D2, Math.random()*4.0);
                phr.addNote(note);
        }
        
        // add the phrase to an instrument and that to a score
        inst.addPhrase(phr);
        score.addPart(inst);
        
        // create a MIDI file of the score
        Write.midi(score, "randomRhythm.mid");
        Play.midi(score);
    }
}