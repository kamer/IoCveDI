package com.test;

import com.loosecoupledwithDI.IHayvan;
import com.loosecoupledwithDI.Kedi;
import com.loosecoupledwithDI.Kopek;

public class Test {
	
	IHayvan hayvan1;
	
	public static void main(String[] args) {
		
		new Test().testiGerceklestir();
	}

	private void testiGerceklestir() {
		
		
		// Hayvan� burada kedi olarak se�tim.
		hayvan1 = new Kedi();
		hayvan1.sesCikar();
		
		
		// Burada ise k�pek.
		hayvan1 = new Kopek();
		hayvan1.sesCikar();
		
		
	}

}
