package controller;

import jm.JMC;
import jm.util.*;
import jm.music.data.*;
import jm.util.*;

/**
 * This class uses the jMusic CPhrase (Chord Phrase)
 * The class generates a chord progression 
 * around the cycle of 5ths
 * It uses static methods in the one file.
 * @author Andrew Brown
 */
public final class Chords implements JMC{
	
	private static Score s = new Score("CPhrase class example");
	private static Part p = new Part("Piano", 0, 0);
		
	public static void main(String[] args){		
		//Let us know things have started
		System.out.println("Creating chord progression . . .");
		
		//choose rootPitch notes around the cycle of fifths
		int rootPitch = 60; //set start note to middle C
                /*
		for (int i = 0; i < 1; i++) {
			secondInversion(rootPitch);
			rootPitch -= 7;
			rootPosition(rootPitch);
			rootPitch += 5;
		}
		*/
                CPhrase chord = new CPhrase();
                
                for(int i=0; i < 4; i++) {
                    int accord[] = new int[3];
                    accord[0] = REST;
                    accord[1] = REST;
                    accord[2] = REST;

                    chord.addChord(accord, EN);

                    accord[0] = rootPitch; 
                    accord[1] = rootPitch + 4;
                    accord[2] = rootPitch + 7;
                    chord.addChord(accord, EN);
                }
                /*
                accord[0] = rootPitch + 5; 
                accord[1] = rootPitch + 9;
                accord[2] = rootPitch + 12;                                                
		chord.addChord(accord, WN);
                
                accord[0] = rootPitch + 7; 
                accord[1] = rootPitch + 11;
                accord[2] = rootPitch + 14;                                                
		chord.addChord(accord, WN);
                */
		p.addCPhrase(chord);
                
                //add a final chord
		ending(rootPitch);
		
		//pack the part into a score
		s.addPart(p);
		s.setTempo(140);
		//display the music
		View.show(s);
		
		// write the score to a MIDIfile
		Write.midi(s, "Chords.mid");
	}	
	
	private static void rootPosition(int rootPitch) {
		// build the chord from the rootPitch 
	 	int[] pitchArray = new int[4];
	 	pitchArray[0] = rootPitch;
	 	pitchArray[1] = rootPitch + 4;
	 	pitchArray[2] = rootPitch + 7;
	 	pitchArray[3] = rootPitch + 12;
	 	//add chord to the part
		CPhrase chord = new CPhrase();
		chord.addChord(pitchArray, C);
		p.addCPhrase(chord);
	}
	
	private static void secondInversion(int rootPitch) {
		// build the chord from the rootPitch 
	 	int[] pitchArray = new int[4];
	 	pitchArray[0] = rootPitch;
	 	pitchArray[1] = rootPitch + 4;
	 	pitchArray[2] = rootPitch - 2;
	 	pitchArray[3] = rootPitch - 5;
	 	//add chord to the part
		CPhrase chord = new CPhrase();
		chord.addChord(pitchArray, C);
		p.addCPhrase(chord);
	}		
	
	private static void ending(int rootPitch) {
		// build the chord from the rootPitch 
	 	int[] pitchArray = new int[4];
	 	pitchArray[0] = rootPitch;
	 	pitchArray[1] = rootPitch + 4;
	 	pitchArray[2] = rootPitch + 7;
	 	pitchArray[3] = rootPitch + 12;
	 	//add chord to the part
		CPhrase chord = new CPhrase();
		chord.addChord(pitchArray, SB);
		p.addCPhrase(chord);
	}				
}