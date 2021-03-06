package com.asoul.supersensitivity;
import javax.sound.midi.InvalidMidiDataException;

public class Main {
    public static void main(String[] args) throws InvalidMidiDataException {
        PianoRoll pianoRoll = new PianoRoll(126, 0);
        Note []SS= {
        		Note.C_6,Note.G_6,Note.G_6,Note.C_6,Note.C_6,Note.C_6,Note.C_6,
        		Note.G_5,Note.D_6,Note.D_6,Note.G_5,Note.G_5,Note.G_5,Note.G_5,
        		Note.A_5,Note.E_6,Note.E_6,Note.A_5,Note.A_5,Note.A_5,Note.A_5,
        	
        		Note.F_5,Note.C_6,Note.C_6,Note.F_5,Note.F_5,Note.F_5,Note.F_5,
        		Note.C_6,Note.G_6,Note.G_6,Note.C_6,Note.G_5,Note.A_5,Note.G_5,
        		Note.G_5,Note.D_6,Note.D_6,Note.G_5,Note.G_5,Note.G_5,Note.G_5,
        		
        		Note.A_5,Note.E_6,Note.E_5,Note.A_5,Note.A_5,Note.A_5,Note.A_5,
        		Note.F_5,Note.C_6,Note.C_5,Note.F_5,
        		
        		Note.A_4,Note.C_5,Note.A_4,
        		Note.C_5,Note.S_0,Note.C_5,Note.S_0,Note.C_5,Note.G_4,Note.B_4,
        		Note.S_0,Note.B_4,Note.S_0,Note.B_4,Note.C_5,Note.D_5,
        		
        		Note.C_5,Note.S_0,Note.C_5,Note.S_0,Note.C_5,Note.G_4,Note.A_4,
        		Note.S_0,Note.C_5,Note.C_5,Note.C_5,Note.F_5,Note.E_5,
        		Note.G_5,Note.S_0,Note.D_5,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.G_5,
        		Note.S_0,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,
        		Note.A_4,Note.S_0,Note.C_5,Note.A_4,Note.C_5,Note.C_5,Note.A_4,Note.C_5,
        		
        		Note.A_4,Note.S_0,Note.A_4,Note.C_5,Note.A_4,
        		Note.C_5,Note.S_0,Note.C_5,Note.S_0,Note.C_5,Note.G_4,Note.B_4,
        		Note.S_0,Note.B_4,Note.S_0,Note.B_4,Note.C_5,Note.D_5,
        		Note.C_5,Note.S_0,Note.C_5,Note.S_0,Note.C_5,Note.G_4,Note.A_4,
        		Note.S_0,Note.C_5,Note.C_5,Note.C_5,Note.F_5,Note.E_5,
        		
        		Note.G_5,Note.S_0,Note.D_5,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.G_5,
        		Note.S_0,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,
        		Note.A_4,Note.S_0,Note.C_5,Note.A_4,Note.C_5,Note.C_5,Note.A_4,Note.C_5,
        		Note.A_4,Note.S_0,Note.S_0,Note.S_0,
        		Note.S_0,Note.C_5,Note.G_5,Note.G_5,Note.D_5,Note.D_5,Note.D_5,Note.C_5,
        		
        		Note.D_5,Note.C_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.G_4,
        		Note.A_4,Note.S_0,Note.S_0,Note.S_0,Note.G_4,
        		Note.D_5,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.E_5,
        		Note.S_0,Note.C_5,Note.G_5,Note.G_5,Note.D_5,Note.D_5,Note.D_5,Note.C_5,
        		
        		Note.D_5,Note.D_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.E_5,Note.F_5,
        		Note.F_5,Note.S_0,Note.G_5,Note.G_5,Note.D_6,
        		Note.D_6,Note.C_6,
        		Note.C_6,Note.S_0,
        		
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.G_5,Note.A_5,Note.G_5,
        		
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.G_5,Note.A_5,Note.G_5,
        		
        		Note.S_0,Note.E_5,Note.C_6,Note.C_6,Note.B_5,Note.B_5,Note.A_5,
        		Note.A_5,Note.G_5,Note.G_5,Note.E_5,Note.E_5,Note.G_5,
        		Note.S_0,Note.E_5,Note.C_6,Note.C_6,Note.B_5,Note.B_5,Note.A_5,
        		Note.A_5,Note.G_5,Note.G_5,Note.E_5,Note.D_6,Note.C_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.A_5,Note.C_6,Note.B_5,Note.B_5,Note.A_5,
        		Note.G_5,Note.A_5,Note.G_5,Note.G_5,Note.S_0,Note.C_5,
        		
        		Note.G_5,Note.G_5,Note.G_5,Note.G_5,Note.G_5,Note.A_5,Note.A_5,
        		Note.G_5,Note.A_5,Note.G_5,Note.G_5,Note.S_0,Note.C_5,
        		Note.C_5,Note.D_5,Note.D_5,Note.E_5,Note.F_5,Note.E_5,Note.E_5,Note.G_5,
        		Note.D_5,Note.C_5,Note.C_5,Note.S_0,Note.C_5,
        		
        		Note.C_6,Note.B_5,Note.B_5,Note.A_5,Note.A_5,Note.G_5,Note.A_5,
        		Note.C_6,
        		Note.S_0,Note.C_6,Note.E_6,Note.F_6,Note.E_6,Note.D_6,Note.C_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.G_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.G_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.E_5,Note.C_6,Note.C_6,Note.B_5,Note.B_5,Note.A_5,
        		Note.A_5,Note.G_5,Note.G_5,Note.E_5,Note.E_5,Note.G_5,
        		Note.S_0,Note.E_5,Note.C_6,Note.C_6,Note.B_5,Note.B_5,Note.A_5,
        		Note.A_5,Note.G_5,Note.G_5,Note.E_5,Note.D_6,Note.C_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.E_5,Note.E_5,Note.G_5,Note.D_6,Note.D_6,
        		Note.S_0,Note.A_5,Note.E_6,Note.A_5,Note.A_5,Note.G_5,
        		Note.S_0,Note.A_5,Note.A_5,Note.G_5,Note.G_5,Note.E_5,Note.E_5,Note.E_5,
        		Note.E_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.F_5,Note.E_5,
        		Note.S_0,Note.C_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.F_5,Note.E_5,
        		Note.S_0,Note.C_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.F_5,Note.E_5,
        		Note.S_0,Note.C_5,Note.D_5,Note.C_5,Note.D_5,Note.E_5,Note.F_5,Note.E_5,
        		Note.E_5,Note.S_0,Note.S_0,
        		Note.S_0,Note.S_0,Note.S_0,Note.S_0,
        		
        };
        int []ss= {
        		4,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		3,1,2,4,2,2,2,
        		2,2,2,2,4,2,2,
        		2,2,2,4,2,4,
        		2,2,2,2,4,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,2,2,2,2,
        		2,4,4,2,2,2,
        		2,2,2,2,2,2,2,2,
        		4,6,2,2,2,
        		2,2,2,2,4,2,2,
        		2,2,2,4,2,4,
        		2,2,2,2,4,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,2,2,2,2,
        		2,4,4,2,2,2,
        		2,2,2,2,2,2,2,2,
        		4,4,4,4,
        		2,2,2,2,2,2,2,2,
        		2,2,2,2,2,4,2,
        		4,4,4,2,2,
        		2,2,2,2,2,2,4,
        		2,2,2,2,2,2,2,2,
        		2,2,2,2,3,1,2,2,
        		8,2,2,2,2,
        		12,4,
        		12,4,
        		
		        2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,4,4,
        		2,2,4,2,2,2,2,
        		2,2,2,2,4,4,
        		2,2,4,2,2,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,3,1,2,2,
        		
        		1,1,2,8,2,2,
        		2,2,2,2,2,4,2,
        		1,1,2,8,2,2,
        		3,1,2,2,3,1,2,2,
        		2,2,8,2,2,
        		3,1,2,2,4,2,2,
        		16,
        		2,2,2,2,2,2,4,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,4,4,
        		2,2,4,2,2,2,2,
        		2,2,2,2,4,4,
        		2,2,4,2,2,2,2,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,2,2,4,4,
        		2,2,4,4,2,2,
        		2,2,2,2,3,1,2,2,
        		4,2,2,2,2,2,2,
        		2,2,2,2,2,2,2,2,
        		2,2,2,2,2,2,2,2,
        		2,2,2,2,2,2,2,2,
        		8,4,4,
        		4,4,4,4
        };
        pianoRoll.setNote(SS, 1, 100, ss);
        pianoRoll.run();
    }

}
	
