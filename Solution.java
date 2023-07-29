import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt() + 1;
			if (n % 3 == 1) {
				System.out.println("NORMAL");
			} else if (n % 3 == 2) {
				System.out.println("HUGE");
			} else {
				System.out.println("SMALL");
			}
		}
		fs.close();
	}
}
