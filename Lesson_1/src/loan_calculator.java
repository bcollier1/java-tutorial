import java.util.Scanner;


public class loan_calculator {

	public loan_calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		double interest = 0.90;
		int months = 3;
		double loan = amount * interest;
		
		/*(switch(months) {
		case 1:	
			System.out.println((int)loan);
		case 2:
			System.out.println((int)(loan * interest));
		case 3:
			System.out.println((int)(loan * interest * interest));
		}*/
		double i = amount;
		for(int time = 0; time < 12; time++) {
			i = i * interest;
			if (time == 2) {
				System.out.println((int)i);	
			}
		}		
	}
}
