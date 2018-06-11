package com.loosecoupledwithDI;

public class HayvanService {
	
	IHayvan hayvan1;

	public HayvanService(IHayvan hayvan1) {
		this.hayvan1 = hayvan1;
		hayvan1.sesCikar();
	}
	
	
	
}
