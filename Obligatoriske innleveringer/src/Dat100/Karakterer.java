package Dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterer {

	public static void main(String[] args) {
		
		// For-løkke 
			for (int kandidat=0; kandidat<10; kandidat++) {
				int  poeng = parseInt (showInputDialog ("Poengsum"));
				
			
		
		// Karakter F 
		if (poeng >= 0 && poeng <= 39) {
			showMessageDialog (null, "Karakter F");
		}
		
		// Karakter E 
		else if (poeng >= 40 && poeng <= 49) {
			showMessageDialog (null, "Karakter E");
			
		}
		
		// Karakter D 
		else if (poeng >= 50 && poeng <= 59) {
			showMessageDialog (null, "Karakter D");
			
		}
		
		// Karakter C 
		else if (poeng >= 60 && poeng <= 79) {
			showMessageDialog (null, "Karakter C");
			
		}
		
		// Karakter B 
		else if (poeng >= 80 && poeng <= 89) {
			showMessageDialog (null, "Karakter B");
			
		}
		
		// Karakter A 
		else if (poeng >= 90 && poeng <= 100) {
			showMessageDialog (null, "Karakter A");

		}
		
		// For høy / lav poengsum
		else {
			showMessageDialog (null, "Ikke en valid poengsum");
			kandidat--;
		}

		
			
		}
	}
		
}
