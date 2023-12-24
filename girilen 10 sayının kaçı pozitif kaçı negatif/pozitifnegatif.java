package ders1;

import java.util.Scanner;

//klavyeden girilen 10 sayının kaçı pozitif kaçı negatif?

public class pozitifnegatif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
int pozitif=0;
int negatif=0;
int sifir=0;

for (int i=0;i<5;i++) {		
 
	        System.out.print("Bir sayı giriniz: ");

int sayi=sc.nextInt();
              
	if (sayi>0) {
	
         pozitif=pozitif+1;
	
}

        else if (sayi<0) {
	
	
	negatif=negatif+1;
	
}

        else {
	
	sifir=sifir+1;
}


}
		
		
		System.out.println("Pozitif sayı adedi: "+pozitif);
		
		System.out.println("Negatif sayı adedi: "+negatif);
		
		System.out.println("Girilen sıfır adedi: "+sifir);
	}

}
