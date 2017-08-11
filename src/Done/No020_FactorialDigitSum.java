package Done;

public class No020_FactorialDigitSum {

	
	public static void Calculat(int n){
		long number=1;
		long finalNumber=0;
		for (int i=n;i>0;i--){
			number*=i;
		}
		
		System.out.println(number);
		
		String a=Long.toString(number);
		for (int i=0;i<a.length();i++){
			finalNumber+=Character.getNumericValue(a.charAt(i));
			
		}
	
		System.out.println(finalNumber);
	}
}
