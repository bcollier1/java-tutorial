
public class lesson_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8; int y = 5;
		int a = 15; int b = 4;
		
		int result_1 = a/b;
		
		int result = x % y;
		
		System.out.println("Division(a/b): " + result_1);
		System.out.println("Mod(x%y): " + result);
		
		int test = 5;
		
		++test;
		
		System.out.println("Increment(++test): " + test);
		
		--test;
		
		System.out.println("Decrement(--test): " + test);

		int num1 = 4;
		int num2 = 8;
		num2 += num1; // num2 = num2 + num1;
		System.out.println(num2);
		num2 -= num1; // num2 = num2 - num1;
		System.out.println(num2);
		
		
	}

}
