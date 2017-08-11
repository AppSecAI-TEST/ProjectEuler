package Done;

public class No030_DigitFifthPower {

	//	a^5+b^5+c^5+d^5+e^5=abcde;

	static int number=0;
	static String numberString="";
	static int x=5;

	public static void Calculate(){
		for (int a=0;a<10;a++){
			for (int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					for (int d=0;d<10;d++){
						for (int e=0;e<10;e++){
							number=(int)( (Math.pow(a, x)+Math.pow(b, x)+Math.pow(c, x)+Math.pow(d, x)+Math.pow(e, x)));
							numberString="";
							numberString=Integer.toString(a)+b+c+d+e;
							//						System.out.println(a+"+"+b+"+"+c+"+"+d+"="+numberString);


							if (Integer.toString(number).equals(numberString)) {System.out.println(a+"^5+"+b+"^5+"+c+"^5+"+d+"^5+"+e+"^5="+number);}
						}
					}
				}
			}
		}
	}
}
