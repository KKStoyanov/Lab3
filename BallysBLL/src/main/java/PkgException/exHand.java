package PkgException;

import pkgPokerBLL.Hand;

public class exHand extends Exception {
	
	public exHand() {
		System.out.println("The top two hands are tied");
	}

}
