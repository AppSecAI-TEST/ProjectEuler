package Done;

public class SpecialPythagorianTriplett {


	public static void Calculate(){
	for (int a=1;a<1000;a++){
		for (int b=1;b<1000;b++){
			for (int c=1;c<1000;c++){

				if (a+b+c==1000 && Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2) && a<b && b<c){
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}
}

}


