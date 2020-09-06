package Dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class fakultet {

	public static void main(String[] args) {
		
		// Inntast av verdi 
		String nTekst = showInputDialog ("Tast inn et heltall: ");
				
		// angir variabler
				int n = parseInt (nTekst);
				int i = 1;
				int resultat;
		
		// While-løkke
				while (n>i) {
					i *= n;
					n--;
				}
			
				showMessageDialog ("Fakultetet til tallet du tastet inn blir: " + i);
	}
	
}

				
			

