

import java.util.ArrayList;

public class No023_NonAbundantNumbers {
	static int maxNumber = 28123;
	static int sum=0;

	static long finalNumber=0l;

	private static int properDivisors(int n){
		sum=0;
		for (int i=2;i<=n;i++){
			if (n%i==0) sum+=n/i;				
		}
		if (sum<n) return sum;
		else return 0;
	}
	



	public static void Calculate(){

		for (int i=1;i<maxNumber;i++){
			finalNumber+=properDivisors(i);
		}

		System.out.println(finalNumber);
//		System.out.println(finalNumber);
//		for (int i=i;i<maxNumber;i++){
//			finalNumber+=properDivisors(i);
//		}



		//		for (int i=0; i<maxNumber;i++){
		//			finalNumber+=properDivisors(i);
		//			4179871
		//		}



	}
}

