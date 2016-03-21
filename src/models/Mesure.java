package models;

import static jm.constants.Volumes.P;
import jm.music.data.Note;
import jm.music.data.Phrase;

public class Mesure {
        // attribut(s)
    Phrase phrase;
        // methode(s)
    // constructeur(s)
    public Mesure(Phrase p) { this.phrase = p; };
    // accesseur(s)

    // mutateur(s)

    // autre(s)
    public void ajouter(int[] notes, double[] durees) {
        phrase.addNoteList(notes, durees);
    }
    public void setVolume(int v) {
        Phrase temp = new Phrase(0.0);
        int[] pitchArray = this.phrase.getPitchArray();
        double[] durationArray = this.phrase.getRhythmArray();
        for(int i=0; i < this.phrase.size(); i++) {
            temp.addNote(new Note(pitchArray[i], durationArray[i], P));
        }
        this.phrase = temp;
    }
}