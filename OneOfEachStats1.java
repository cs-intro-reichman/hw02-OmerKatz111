/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		boolean isGirl = false;
		boolean isBoy = false;
		int two = 0;
		int three = 0;
		int four = 0;
		int children = 0;
		double avg = 0.0;
		for (int i = 1; i <= n; i++){
			while ((isBoy != true) || (isGirl != true)) {
				if (Math.random() < 0.5) {
					isGirl = true;
					children++;
				}
				else {
					isBoy = true;
					children++;
				}
		
			}
			avg = avg + children;
			if (children == 2){
				two++;
			}
			if (children == 3){
				three++;
			}
			if (children >= 4){
				four++;
			}
			isBoy = false;
			isGirl = false;
			children = 0;
		}
		avg = (avg/n);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + four);
		if ((two >= three) && (two >= four)){
			System.out.println("The most common number of children is 2.");
		}
		if ((three > two) && (three >= four)) {
			System.out.println("The most common number of children is 3.");
		}
		if ((four > two) && (four > three)) {
			System.out.println("The most common number of children is 3.");
		}
	}
		
}
