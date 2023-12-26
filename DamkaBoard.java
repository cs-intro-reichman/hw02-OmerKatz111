/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		int i = 0;
		while (i < x){
			if((i % 2) == 1) {
				System.out.print(" ");
			}
			int j = 0;
			while (j < x){
				if (j ==x) System.out.print("*");
				System.out.print("* ");
				j++;
			}
				System.out.println("");
				i++;
	}
}
}
