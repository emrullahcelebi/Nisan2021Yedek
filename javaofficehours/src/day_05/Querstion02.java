package day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Querstion02 {
	/*
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz. Kullanici deger girmek istemedigi zaman donguyu kirin
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		List<String> list=new ArrayList<>();
		
		do {
		System.out.println("Deger girmek isterseniz E'ye \nDeger girmek istemediginiz zaman"
				+ " H'ye basiniz");	
		char secim= scan.next().toUpperCase().charAt(0);
		
		if(secim=='E') {
			System.out.println("Lutfen bir String giriniz");
			list.add(scan.next());
		}else if(secim=='H') {
			break;
		}else {
			System.out.println("Yanlis giris yaptiniz tekrar deneyiniz");
		}

		}while(true);
		
		System.out.println(list);
		
		
		
		
	}

}
