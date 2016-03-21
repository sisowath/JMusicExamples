package models;

import static jm.constants.Durations.*;
import jm.music.data.Note;
import jm.music.data.Phrase;

public class StyleBassRoamvong {
        // attribut(s)
    Phrase phrase;
        // methode(s)
    // constructeur(s)
    public StyleBassRoamvong(Phrase p) {this.phrase = p;}
    // accesseur(s)

    // mutateur(s)

    // autre(s)
    public void ajouter(int[] pitch, int v, double p) {
        double[] rhythmes = new double[pitch.length];
        for(int i=0; i < rhythmes.length-3; i ++) { 
            rhythmes[i] = DQN;
            rhythmes[i+1] = QN;
            rhythmes[i+2] = EN;
            rhythmes[i+3] = QN;
        }
        int[] volumes = new int[pitch.length];
        for(int i=0; i < volumes.length; i++) {volumes[i] = v;}
        double[] panning = new double[pitch.length];
        for(int i=0; i < panning.length; i++) {panning[i] = p;}        
        for(int i=0; i <pitch.length; i++) {
            this.phrase.add(new Note(pitch[i], rhythmes[i], volumes[i], panning[i]));
        }
    }
}