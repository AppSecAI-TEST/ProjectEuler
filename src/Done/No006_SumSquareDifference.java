package Done;

public class No006_SumSquareDifference {
	
	
	public static void Calculate(int number)  {
		
		double SumOfSquares=0;
		double SquareOfSums=0;
		double square=0;
		for(int i=0;i<=number;i++){
			square+=i;
			SumOfSquares+=Math.pow(i, 2);
			
			
		}
		System.out.println(SumOfSquares);
		SquareOfSums=Math.pow(square, 2);
		System.out.println(SquareOfSums);
		System.out.println(SquareOfSums-SumOfSquares);
	
	
	
	}
}
