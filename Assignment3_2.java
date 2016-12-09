package ASSIGNMENTS;

//Write a Java statement to assign the value true to the boolean variable same , 
//when the String variable S1 has the same contents as the String variable S2 , and false otherwise.

public class Assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean same = false;

		String S1 = new String("Hello World");
		String S2 = new String("Hello World");

		if (S1.equals(S2))
			same = true;
		
		System.out.println(same);
	}

}
