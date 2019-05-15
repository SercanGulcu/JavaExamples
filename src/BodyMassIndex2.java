import java.util.Scanner;

public class BodyMassIndex2 {

	public static void main(String[] args) {

		System.out.print("Please enter your weight:");
		
		Scanner scanner=new Scanner(System.in);
		int weight= scanner.nextInt();
		
		System.out.print("Please enter your height:(For example 1.80)");
		
		double height=scanner.nextDouble();
		
		double Bmi = weight / (height*height);
		System.out.println("Your Body Mass Index:" + Bmi);
		if(Bmi<18.5)
			System.out.println("THIN...");
		
		else if (Bmi>=18.5 && Bmi<25)
			System.out.println("NORMAL...");
		
		else if (Bmi>=25 && Bmi<30)
			System.out.println("OWERWEIGHT...");
		
		else 
			System.out.println("OBESE...");
		
		
		}
	}


