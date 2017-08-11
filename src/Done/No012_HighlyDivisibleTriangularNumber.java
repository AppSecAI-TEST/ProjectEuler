package Done;
import java.util.ArrayList;
//OBS! Long calculation time!!
public class No012_HighlyDivisibleTriangularNumber {

	private static long number=0l;
	private static long i=1;
	static ArrayList<Long> numberList = new ArrayList<>();
	public static void Calculate(int nrOfDivisions){

		while(true){
			number+=i++;
			
			
			for (int j=1;j<number;j++){
				if(number%j==0){
					numberList.add(number/j);
				}
			}
			
			if (numberList.size()>=nrOfDivisions) break;
			numberList.clear();
		}
	
		
		
		
		System.out.println("The highest triangle number to be dividable atleast "+nrOfDivisions+" times is : "+--i);
	
		
	}
}
