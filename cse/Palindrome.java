package reva.cse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String sentence, reverse;
	int size;
	Palindrome(){
		sentence = "";
		reverse = "";
		size = 0;
	}
	
	void Read() throws IOException{
		System.out.print("Enter the sentence: ");
		sentence = br.readLine();
		size = sentence.length();
		
		if(sentence.charAt(size-1)!='.') {
			sentence = sentence+".";
			size = size+1;
		}
	}
	
	void exFirstLast() {
		String s1 = "";
		char ch;
		for (int i=0; i<size; i++) {
			ch = sentence.charAt(i);
			if (ch != ' ' && ch != '.') {
				s1 = s1+ch;
			}else {
				int l = s1.length();
				
				for (int j=0; j<l; j++) {
					if  (j==0)
						ch = s1.charAt(l-1);
					else if(j==(l-1))
						ch = s1.charAt(0);
					else
						ch = s1.charAt(j);
					reverse = reverse+ch;
				}
				reverse = reverse+" ";
				s1 = "";
			}
		}
	}
	
	void display() {
		System.out.println("The Original Scentence is: "+sentence);
		System.out.println("The Changed Scentence is: "+reverse);
	}
	
	public static void main(String[] args) throws IOException{
		Palindrome ob = new Palindrome();
		ob.Read();
		ob.exFirstLast();
		ob.display();
	}
}



















