import java.util.Scanner;

public class GreastesCommonDivisior {
  
	public static int ebob(int a, int b) {
		int ebob=1;
		
		    for(int i=1; i<=a && i<=b; i++) {
		    	
		    	if(a%i==0 && b%i==0)
		    		ebob=i;
		    }
		
		
		return ebob;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number:");
		int numb1=scanner.nextInt();
		
		System.out.println("Second number:");
		int numb2=scanner.nextInt();
		
		System.out.println("GCD:" + ebob(numb1,numb2));
	}
	   
	   
}
