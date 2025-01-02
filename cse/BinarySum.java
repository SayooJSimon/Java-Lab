package me;
import java.util.Scanner;

public class BinarySum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first decimal: ");
		int dec1 = s.nextInt();
		System.out.println("Enter the second decimal: ");
		int dec2 = s.nextInt();
		
		String bin1 = decimalToBinary(dec1);
		String bin2 = decimalToBinary(dec2);
		System.out.println("The binary rep of "+dec1+" :"+ bin1);
		System.out.println("The binary rep of "+dec2+" :"+ bin2);
		
		String sum = addBin(bin1, bin2);
		System.out.println("The sum is "+sum);
	}
	
	public static String decimalToBinary(int dec) {
		if(dec == 0)
			return "0";
		StringBuilder binary = new StringBuilder();
		while(dec>0) {
			int rem = dec%2;
			binary.insert(0, rem);
			dec/=2;
		}
		return binary.toString();
	}
	
	public static String addBin(String bin1, String bin2) {
		int carry = 0;
		StringBuilder result = new StringBuilder();
		int i = bin1.length()-1;
		int j = bin2.length()-1;
		while(i>=0||j>=0||carry>0) {
			int dig1 = i>=0 ? bin1.charAt(i--) - '0' : 0;
			int dig2 = j>=0 ? bin2.charAt(j--) - '0' : 0;
			int sum = dig1+dig2+carry;
			result.insert(0, sum%2);
			carry = sum/2;
		}
		return result.toString();
	}
}
