package Done;
import java.util.ArrayList;

public class No003_LargestPrimeFactor {
	
	private static ArrayList<Long> primeFactors=new ArrayList<>();
	static Long n=600851475143L;
	
	public static void calculate(Long number){
	
	
		long x=number;
		n=number;
		
		for(long i=2;i<n;i++){
			
		if(n%i==0){
			
			
			n=n/i;
			primeFactors.add(i);
		}
		
		}
		System.out.print("the primes of '"+x+"' is: ");
		primeFactors.forEach(s->{System.out.print(s+" ");});
	}
	
//	13195 5 7 13 29
	
}
