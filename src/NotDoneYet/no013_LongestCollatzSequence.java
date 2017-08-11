package NotDoneYet;
import java.util.ArrayList;

public class no013_LongestCollatzSequence {


	private static ArrayList<Long> numberList = new ArrayList<>();
	private static ArrayList<String> numberCountList = new ArrayList<>();
	public static void Calculate(){

		for (long n=1;n<13;n++){
			
			while (n>1){
				if (n%2==0) n=n/2;
				else if(n%2==1) n=3*n+1;

				numberList.add(n);
			}
		}
		numberList.forEach(s->{System.out.print(s+" ");});
		numberCountList.add(numberList.size()+" nr of items");
		System.out.println(numberList.size());
		System.out.println(numberCountList.get(0));
	}
}
