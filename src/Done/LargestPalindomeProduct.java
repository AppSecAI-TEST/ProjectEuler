package Done;

public class LargestPalindomeProduct {
	static Integer number=0;
	



	static String resultReverse="";
	static String result="123456789";

	public static void Calculate(int numberOfDigits){
		int length=numberOfDigits;
		
		for (int i=0;i<length;i++){
			number=Integer.valueOf(number.toString().concat("9"));
		}

		System.out.println(number);
		MAIN:	for (int i=0;i<number;i++){
			for (int j=0;j<number;j++){
				result=Integer.toString((number-i)*(number-j));
				resultReverse="";
				for(int k=0;k<result.length();k++){

					resultReverse=resultReverse.concat(Character.toString(result.charAt(result.length()-1-k)));
				}

				if(result.equals(resultReverse)){
					System.out.println(result);
					break MAIN;
				}
			}
		}
	}
}