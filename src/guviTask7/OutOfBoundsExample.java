package guviTask7;

public class OutOfBoundsExample {

	public static void main(String[] args) {
	try {
		int[]A={1,2,3,4};
		System.out.println(A[1]);
		String name ="hello";
		System.out.println(name.charAt(8));}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound "+ e.getMessage());
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("String index out of bound "+ e.getMessage());
		
	}

	}

}
