package Done;

public class No016_PowerDigitSum {
	static int number=1000;
	static int finalNumber=0;
	
	static void Calculate(){
		Long numb= (long)Math.pow(2, number);
		String numberString = numb.toString();
		System.out.println(numb);
		for (int i=0;i<numberString.length();i++){
			finalNumber+=Integer.parseInt(numberString.substring(i, i+1));
			
		}
		System.out.println("The sum of the digits is "+finalNumber);
	}
	
}
