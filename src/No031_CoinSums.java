

public class No031_CoinSums {


	//	a*1+b*2+c*5+d*10+e*20+f*50+g*100=200;


	public static void Calculate(){
		int nrOfWays = 1;

		System.out.println(nrOfWays);
		int sum=0;
		for (int a=0;a<=2;a++){									//a100p	
			for (int b=0;b<=4;b++){								//b50p
				for (int c=0;c<=10;c++){						//c20p
					for (int d=0;d<=20;d++){					//d10p
						for (int e=0;e<=40;e++){				//e5p
							for (int f=0;f<=100;f++){			//f2p
								for (int g=0;g<=200;g++){		//g1p
									sum=a*100+b*50+c*20+d*10+e*5+f*2+g*1;
									if (sum==200)nrOfWays++;
								}
							}
						}
					}
				}
			}
		}
	System.out.println(nrOfWays);
	}
}
			//2x100
			//1x100+2x50
			//4x50