package syj;
import java.util.Scanner; 

abstract class Bank { 
	public abstract double calculateEMI(double principal, int duration, double rateOfInterest); 
} 
 
class HDFC extends Bank { 
	@Override 
	public double calculateEMI(double principal, int duration, double rateOfInterest) { 
     	double monthlyInterestRate = rateOfInterest / 1200; 
     	double emi = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -duration)); 
     	return emi; 
	} 
} 
 
class SBI extends Bank { 
 	@Override 
 	public double calculateEMI(double principal, int duration, double rateOfInterest) { 
     	double monthlyInterestRate = rateOfInterest / 1200; 
     	double emi = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -duration)); 
     	return emi; 
 	} 
} 
class IDFC extends Bank { 	 
 	@Override 
 	public double calculateEMI(double principal, int duration, double rateOfInterest) { 
     	double monthlyInterestRate = rateOfInterest / 1200; 
     	double emi = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -duration)); 
     	return emi; 
 	} 
} 
 
public class AbstractInterfaceEG { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
	    System.out.print("Enter Principal Amount: INR"); 
	    double principal = scanner.nextDouble(); 
	    System.out.print("Enter Duration (in months): "); 
	   int duration = scanner.nextInt(); 
	    System.out.print("Enter Rate Interest for HDFC (%): "); 
	    double rateOfInteresthdfc = scanner.nextDouble(); 
	    System.out.print("Enter Rate Interest for SBI (%): "); 
	    double rateOfInterestsbi = scanner.nextDouble(); 
	    System.out.print("Enter Rate Interest for IDFC (%): "); 
	    double rateOfInterestidfc = scanner.nextDouble(); 
	    HDFC hdfc = new HDFC(); 
	    SBI sbi=new SBI(); 
	    IDFC idfc=new IDFC(); 
	    double emihdfc = hdfc.calculateEMI(principal, duration, rateOfInteresthdfc); 
	    double emisbi = bank1.calculateEMI(principal, duration, rateOfInterestsbi); 
	    double emiidfc = bank1.calculateEMI(principal, duration, rateOfInterestidfc); 
	    System.out.println("Monthly EMI (HDFC): INR =>" + emihdfc); 
	    System.out.println("Monthly EMI (SBI): INR =>" + emisbi); 
	    System.out.println("Monthly EMI (IDFC): INR =>" + emiidfc); 
	} 
} 