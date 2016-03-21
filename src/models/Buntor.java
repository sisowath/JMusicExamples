package models;

import static jm.constants.Durations.*;
import jm.music.data.Note;
import static jm.music.data.Note.*;
import jm.music.data.Phrase;

public class Buntor {
        // attribut(s)
    Phrase phrase;
    int nbrMesures;
    int[][] pitchArray;
    double[][] rhythmArray;
    int[][] volumes;
    double[][] panning;
        // methode(s)
    // constructeur(s)
    public Buntor(Phrase p, int nbrMesures ) {
        this.phrase = p;
        this.nbrMesures = nbrMesures;
        this.pitchArray = new int[this.nbrMesures][];
        this.rhythmArray = new double[this.nbrMesures][];
        this.volumes = new int[this.nbrMesures][];
        this.panning = new double[this.nbrMesures][];
    }
    // accesseur(s)

    // mutateur(s)

    // autre(s)
    public void ajouter(int start, int[] pitches, double[] rhythmes, int v, double p) {
        int[] volumesTemp = new int[pitches.length];
        for(int i=0; i < volumesTemp.length; i++) { volumesTemp[i] = v;}
        double[] panningTemp = new double[pitches.length];
        for(int i=0; i < panningTemp.length; i++) {panningTemp[i] = p;}
        this.pitchArray[start] = pitches;
        this.rhythmArray[start] = rhythmes;
        this.volumes[start] = volumesTemp;
        this.panning[start] = panningTemp;
    }
    public void go() {
        for(int i=0; i < this.nbrMesures; i++) {
            if(this.pitchArray[i] == null) {
                this.phrase.add(new Note(REST, WN));
            } else {
                for(int j=0; j < this.pitchArray[i].length; j++) {
                    this.phrase.add(new Note(this.pitchArray[i][j], this.rhythmArray[i][j], this.volumes[i][j], this.panning[i][j]));
                }
            }
        }
    }
}