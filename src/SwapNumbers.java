import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		 
		a = a + b; //5
		b = a - b; //2
		a = a - b; //3
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}

}
