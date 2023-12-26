/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int max;
		double ran1 = Math.random();
		double ran2 = Math.random();
		int x = (int) (ran1 * 10);
		int y = (int) (ran2 * 10);
		System.out.print(x);
		if (y >= x){
				do{
					System.out.print(" " + y);
					max = y;
					y = (int) (Math.random() * 10);
				}while (max < y);
		
		}
	}
}
