import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter any number: ");
			int number = scanner.nextInt();
			if (number % 2 == 0) {
				System.out.println(number + " is even.");
			} else {
				System.out.println(number + " is odd.");
			}
	}

}
