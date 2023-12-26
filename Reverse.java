/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String s = args[0];
		char x = 'a';
		int left = 0;
		int right = s.length() - 1;
		for (int i = right; i >= 0; i--){
			System.out.print(s.charAt(i));
			if ((i == left) || (i == (left + 1))){ 
				x = s.charAt(i);
				}
			left++;
		}
		System.out.println();
		System.out.println("The middle character is " + x);
	}
}
