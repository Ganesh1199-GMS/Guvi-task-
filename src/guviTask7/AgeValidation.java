package guviTask7;
 

public class AgeValidation {

	public static void AgeValidation (int age) throws  InvalidAgeException {
		if (age<18){
			throw new InvalidAgeException ("Age must be 18 or older.");}
			
		
		else {
			System.out.println("Age is valid.");
		}
	}
	public static void main(String[] args) {
	try {	
   AgeValidation(16);
	}
  catch (InvalidAgeException e) {
	  System.out.println("Caught Exception: " + e.getMessage());}
  }
}
  
