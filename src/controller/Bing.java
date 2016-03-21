package controller;

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public final class Bing implements JMC {
    
    public static void main(String[] args) {
        Play.midi(new Note(A3, 0.50));
        Play.midi(new Note(C4, 0.50));
        Play.midi(new Note(D4, 2));
    }
}
