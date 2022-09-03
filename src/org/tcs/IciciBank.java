package org.tcs;

import org.ici.test.DanielBank;

public class IciciBank extends DanielBank {
	public void fixed() {
		System.out.println("8%");
	}
		public void savings() {
		System.out.println("12%");
	}
	public static void main(String[] args) {
		IciciBank h=new IciciBank();
		h.fixed();
		h.savings();
		h.Deposit();
		h.depit();

		
	}
	
	}
	
