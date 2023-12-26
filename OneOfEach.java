
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean isGirl = false;
		boolean isBoy = false;
		int children = 0;
		while ((isBoy != true) || (isGirl != true)) {
			if (Math.random() < 0.5) {
				isGirl = true;
				System.out.print("g ");
				children++;
			}
			else {
				isBoy = true;
				System.out.print("b ");
				children++;
		}
		
	}
		System.out.println();
		System.out.println("You made it... and you now have " + children + " children.");
}
}