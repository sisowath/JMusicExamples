/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static jm.constants.DrumMap.ACOUSTIC_BASS_DRUM;
import static jm.constants.Durations.DQN;
import static jm.constants.Durations.QN;
import static jm.constants.Panning.PAN_LEFT;
import static jm.constants.Volumes.FFF;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;

/**
 *
 * @author Emanresu
 */
public class RythmeRoamvong extends Part {
    
    Phrase phraseDrumsAB = new Phrase(0.0);
    Phrase phraseDrumsCB = new Phrase(0.0);
    Phrase phraseDrumsLC = new Phrase(0.0);
    Phrase phraseDrumsOHC = new Phrase(0.0);
    Phrase phraseDrumsCHH = new Phrase(0.0);
    
    public RythmeRoamvong(Part drums) {
        phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, DQN, FFF, PAN_LEFT));
        phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, DQN, FFF, PAN_LEFT));
        phraseDrumsAB.add(new Note(ACOUSTIC_BASS_DRUM, QN, FFF, PAN_LEFT));
        phraseDrumsCB.add(new Note(COWBELL, HN, FF, PAN_RIGHT));
        phraseDrumsCB.add(new Note(COWBELL, HN, FF, PAN_RIGHT));
        phraseDrumsLC.add(new Note(REST, EN));
        phraseDrumsLC.add(new Note(REST, SN));
        phraseDrumsLC.add(new Note(LOW_CONGA, SN, FF));
        phraseDrumsLC.add(new Note(LOW_CONGA, EN, FF));
        phraseDrumsLC.add(new Note(LOW_CONGA, EN, FF));
        phraseDrumsLC.add(new Note(REST, HN));
        phraseDrumsOHC.add(new Note(REST, HN));
        phraseDrumsOHC.add(new Note(REST, EN));
        phraseDrumsOHC.add(new Note(OPEN_HI_CONGA, EN));
        phraseDrumsOHC.add(new Note(OPEN_HI_CONGA, QN));
        for(int i=0; i < 8; i++)
            phraseDrumsCHH.add(new Note(CLOSED_HI_HAT, EN));
        drums.add(phraseDrumsAB);
        drums.add(phraseDrumsCB);
        drums.add(phraseDrumsLC);
        drums.add(phraseDrumsOHC);
        drums.add(phraseDrumsCHH);
    }
}
