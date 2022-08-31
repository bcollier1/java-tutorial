import java.util.Scanner;
public class practice_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = user_input.next();
		
		double num1;
		double num2;
		
		/* while (true) {
			System.out.print("Please input a number: ");
			double num1 = user_input.nextDouble();
			if (num1 < 0) {
				System.out.println("Invalid Input!");
			}
			else
				break;
		}
		while (true) {
			System.out.print("Please input a second number: ");
			double num2 = user_input.nextDouble();
			if (num2 < 0) {
				System.out.println("Invalid Input!");
			}
			else
				break;
		} */
		
		do {
			System.out.println("Please enter a positive number: ");
			while (!user_input.hasNextDouble()) {
				System.out.println("Invalid Input!");
				user_input.next();
			}
			num1 = user_input.nextDouble();
		} while(num1 <= 0);
		do {
			System.out.println("Please enter a positive number: ");
			while (!user_input.hasNextDouble()) {
				System.out.println("Invalid Input!");
				user_input.next();
			}
			num2 = user_input.nextDouble();
		} while(num2 <= 0);
		
		double sum = num1 + num2;
		double avg = (num1 + num2) / 2;
		double sqRT = Math.sqrt(avg);
		double powNum1 = Math.pow(num1, avg);
		double powNum2 = Math.pow(num2,  avg);
		
		System.out.println("Your name is: " + name);
		System.out.println("The sum of your two numbers is: " + sum);
		System.out.println("The average of your two numbers is: " + avg);
		System.out.println("The square root of the average of the two numbers is: "+ sqRT);
		System.out.println("The base of " + num1 + " to the power of " + avg + " is: " + powNum1);
		System.out.println("The base of " + num2 + " to the power of " + avg + " is: " + powNum2);
	}
}
