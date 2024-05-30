package ders1;

public class kuplertoplami {

	public static void main(String[] args) {

		//1 den 100 e kadar olan sayıların küplerinin toplamı


		
		int toplam = 0;		

		
for (int i=1;i<=101;i++) 
{

		
toplam = toplam+(i*i*i);



}
		
		System.out.println("1'den 100'e kadar olan sayıların küpleri toplamı : "+toplam);
		
	}

}
