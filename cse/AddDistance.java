package me;
import java.util.Scanner;

public class AddDistance {
	int inch, feet;
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in inches: ");
		inch = sc.nextInt();
	}
	
	public void Display() {
		System.out.println("Feet: "+feet+" Inches: "+inch+"\n");
	}
	
	public void Addition(AddDistance D1, AddDistance D2) {
		inch = D1.inch + D2.inch;
		feet = D1.feet + D2.feet + (inch/12);
		inch = inch%12;
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Enter the option \n1.Add\n0.Exit");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				AddDistance D1 = new AddDistance();
				AddDistance D2 = new AddDistance();
				AddDistance D3 = new AddDistance();
				
				System.out.println("Enter First distance: ");
				D1.Read();
				
				System.out.println("Enter Second distance: ");
				D2.Read();
				
				D3.Addition(D1, D2);
				
				System.out.println("Total distance is: ");
				D3.Display();
				break;
				
			case 0: System.exit(0);
			
			default: System.out.println("Invalid Input");
			}
		}
	}
}
