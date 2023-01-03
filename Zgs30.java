package zoho;
import java.util.Scanner;

public class Zgs30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		if(x>y||z>y) {
			if(x>z) {
				System.out.printf("%d is greater",x);
			}
			else {
				System.out.printf("%d is greater",z);
			}
		}
		else {
			System.out.printf("%d is greater",y);
		}
	}

}
