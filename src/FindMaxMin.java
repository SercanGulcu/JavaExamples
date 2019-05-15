import java.util.Scanner;

public class FindMaxMin {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter first number:");
		int no1 = scanner.nextInt();

		System.out.print("Please enter second number:");
		int no2 = scanner.nextInt();

		System.out.print("Plese enter third number:");
		int no3 = scanner.nextInt();

		int max = 0;
		if (no1 >= no2 && no1 >= no3)
			max = no1;
		else if (no2 >= no1 && no2 >= no3)
			max = no2;
		else
			max = no3;
		System.out.println("Max number:" + max);

		int min = 0;
		if (no1 <= no2 && no1 <= no3)
			min = no1;
		else if (no2 <= no1 && no2 <= no3)
			min = no2;
		else
			min = no3;
		System.out.println("Min number :" + min);

	}

}
