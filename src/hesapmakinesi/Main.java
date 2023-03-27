package hesapmakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 , sayi2 , secim ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("birinci sayiyi giriniz");
		sayi1 = scanner.nextInt();
		
		System.out.println("ikinci sayiyi giriniz");
		sayi2= scanner.nextInt();
		
		System.out.println("1-TOPLAMA // 2-CIKARTMA // 3-CARPMA // 4-BOLME");
		System.out.println("seciminizi giriniz");
		secim = scanner.nextInt();
		
		switch(secim) {
		case 1 :
			System.out.println("sonuc  :" + (sayi1+sayi2));
			break ;
		
		case 2 :
			System.out.println("sonuc : " + (sayi1-sayi2));
			break ;
			
		case 3 :
			System.out.println("sonuc : " + (sayi1*sayi2));
			break ;
			
		case 4 : 
			System.out.println("sonuc : " + (sayi1/sayi2));
			break ;
			
		
		}
			

	}}
