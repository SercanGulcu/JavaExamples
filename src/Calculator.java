import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		
	   System.out.println("Please select the operation:");
	   System.out.println("Press 1 for Sum \nPress 2 for Subraction\nPress 3 for Multiplication\nPress 4 for Division");
		
	   int operation=0;
	   operation=scanner.nextInt();
	   
	   switch (operation) {
	case 1:
		System.out.println("Enter the two numbers:");
		int no1=scanner.nextInt();
		int no2=scanner.nextInt();
		System.out.println("Result is:"+ (no1+no2));
		break;
	case 2:
		System.out.println("Enter the two numbers:");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		System.out.println("Result is:"+ (number1-number2));
		break;
	case 3:
		System.out.println("Enter the two numbers:");
		int numb1=scanner.nextInt();
		int numb2=scanner.nextInt();
		System.out.println("Result is:"+ (numb1*numb2));
		break;
	case 4:
		System.out.println("Enter the two numbers:");
		double n1=scanner.nextDouble();
		double n2=scanner.nextDouble();
		System.out.println("Result is:"+ (n1/n2));
		break;

	default:
		System.out.println("Faulty selection...");
		break;
	}
	   
	}

}
