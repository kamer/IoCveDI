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
		
		
		// Hayvaný burada kedi olarak seçtim.
		hayvan1 = new Kedi();
		hayvan1.sesCikar();
		
		
		// Burada ise köpek.
		hayvan1 = new Kopek();
		hayvan1.sesCikar();
		
		
	}

}
