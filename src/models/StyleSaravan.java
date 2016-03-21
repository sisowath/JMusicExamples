package models;

import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;

public class StyleSaravan extends Part {
        // attribut(s)
    Phrase phraseDrumSnare;
    Phrase phraseCHH;
        // methode(s)
    // constructeur(s)
    public StyleSaravan(Part drum) {
        this.phraseDrumSnare = new Phrase(0.0);
        this.phraseCHH = new Phrase(0.0);
        this.phraseDrumSnare.setStartTime(WN);
        this.phraseCHH.setStartTime(WN);
        this.phraseDrumSnare.add(new Note(ACOUSTIC_BASS_DRUM, QN, FF));
        this.phraseDrumSnare.add(new Note(ACOUSTIC_SNARE, QN, FF));
        this.phraseDrumSnare.add(new Note(ACOUSTIC_BASS_DRUM, EN, FF));
        this.phraseDrumSnare.add(new Note(ACOUSTIC_BASS_DRUM, EN, FF));
        this.phraseDrumSnare.add(new Note(ACOUSTIC_SNARE, QN, FF));
        for(int i=0; i < 8; i++) { this.phraseCHH.add(new Note(CLOSED_HI_HAT, EN, F));}
        drum.add(this.phraseDrumSnare);
        drum.add(this.phraseCHH);
    }
    // accesseur(s)

    // mutateur(s)

    // autre(s)

}