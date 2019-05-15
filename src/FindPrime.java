
public class FindPrime {
	
	public static Boolean Prime(int a) {
		
		
		for(int i=2; i<a; i++) {
			
			 if(a%i==0) {
				 return false;
			 }
		}
		
		  return true;
	}
	public static void main(String[] args) {
	
		for(int i=2; i<1000; i++) {
			if(Prime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
}
