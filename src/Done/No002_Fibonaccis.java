package Done;
import java.util.ArrayList;

public class No002_Fibonaccis {

	private static int maxNumber=4000000;
	private static int sumOfEven=0;
	private static ArrayList<Integer> fibbonaciList=new ArrayList<>();

	//TODO: make 2 methods - one to print list, and one to print even
	//TODO: make constructor to set maxNumber

	public static void calculate(){
		fibbonaciList.add(1);
		fibbonaciList.add(2);

		while(fibbonaciList.get(fibbonaciList.size()-1)<maxNumber){

			int nextNumber=fibbonaciList.get(fibbonaciList.size()-1)+fibbonaciList.get(fibbonaciList.size()-2);
			fibbonaciList.add(nextNumber);
		}
		if(fibbonaciList.get(fibbonaciList.size()-1)>maxNumber) fibbonaciList.remove(fibbonaciList.size()-1);
		fibbonaciList.forEach(s-> System.out.print(s+", "));

		for (int i:fibbonaciList){
			if (i%2==0) sumOfEven+=i;
		}

		System.out.println("\n"+sumOfEven);



	}
}