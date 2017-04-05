package PkgException;

public class HandException extends Exception{
	
	public HandException(){
		
	}
	
	public HandException(int numCards){
		System.out.println("The hand does not have five cards. It has " + numCards);
	}

}
