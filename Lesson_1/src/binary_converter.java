import java.util.Scanner;

class Converter{
	public static void toBinary(int num){
		String binary="";
		while(num>0) {
			binary = (num%2) + binary;
			num /= 2;
		}
		System.out.println(binary);
	}
	
}

public class binary_converter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Converter.toBinary(x);
    }
}
