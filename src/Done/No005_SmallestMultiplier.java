package Done;

public class No005_SmallestMultiplier {


		
		static long x = 0L;
		static long number=0L;


		public static void Calculate(long n){	
			
			System.out.println("calculating...");
					while(x!=n){
						x=0l;
						number++;
						for (long i=1;i<=n;i++){
							if (number%i!=0) break;
							x++;

							//			}
						}
					}
					System.out.println(number);
		}
		
		
	
}
