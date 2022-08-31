import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] arr = text.toCharArray();
		char[] arr2 = new char[arr.length];
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i = arr.length-1; i >= 0; --i) {
			System.out.print(arr[i]);
		}
	}
}
