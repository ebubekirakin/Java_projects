package ders1;

import java.util.Scanner;

public class nothesaplama {

	
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.print("1. vize notu giriniz: ");

		double vize1=sc.nextDouble();
		
		
		System.out.print("2. vize notu giriniz: ");

		double vize2=sc.nextDouble();
		
		
		System.out.print("Final notu giriniz: ");

		double fnal=sc.nextDouble();
		
		
double ortalama=vize1*(20.0/100)+vize2*(20.0/100)+fnal*(60.0/100);

if(ortalama>=60) {
	
	System.out.println("Notunuz: "+ortalama+"\n"+"Durumu: Geçti");
	
	
}	

else {
	
	System.out.println("Notunuz: "+ortalama+"\n"+"Durumu: Kaldı");
	
}


		
	}

}
