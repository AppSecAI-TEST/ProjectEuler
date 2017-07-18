package Done;

public class MultiplierOf {
	private static int sum;
	private static int maxNumber=100;
	private static int minNumber=0;
	private static int multiplyer1=3;
	private static int multiplyer2=5;
	
	public MultiplierOf( int max, int min, int m1, int m2) {
		

		maxNumber = max;
		minNumber = min;
		multiplyer1 = m1;
		multiplyer2 = m2;

		
		
		
	}
	
	public static int calculate(){
		for(int i=minNumber;i<maxNumber;i++){
			if(i%multiplyer1==0 || i%multiplyer2==0) sum+=i;
			
		}
		System.out.println(sum);
	return sum;
	}
	
	



}
