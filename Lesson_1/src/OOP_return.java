
public class OOP_return {

	static int sum(int val1, int val2) {
		return val1 + val2;
	}
	
	static int max(int a , int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sum(2, 5);
		System.out.println(x);
	}
	
	public static void main_1(String[] args) {
		int res = max(7,42);
		System.out.println(res);
	}

}
