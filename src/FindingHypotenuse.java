import java.util.Scanner;

public class FindingHypotenuse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter first edge:");
		int a=scanner.nextInt();
		
		System.out.print("Please enter second edge:");
		int b=scanner.nextInt();
		
		double c= Math.sqrt(a*a + b*b);
		
		System.out.println("Hypotenuse:" + c);

	}

}
