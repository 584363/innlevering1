package Dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class fakultet {

	public static void main(String[] args) {
		
		// Inntast av verdi 
		String nTekst = showInputDialog ("Tast inn et heltall: ");
				
		// angir variabler
				int n = parseInt (nTekst);
				int resultat = 1; 	
		
		// utregning
		if (n>0) {
		for (int i = 1; i<=n; i++) {
		resultat = resultat * i;
								
				}
			showMessageDialog (null, "Fakultetet til tallet du tastet inn blir: " + resultat); }
		else {
			
			showMessageDialog (null, resultat);
	}
	
}
}


				
			

