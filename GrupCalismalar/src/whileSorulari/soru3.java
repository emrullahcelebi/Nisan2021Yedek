package whileSorulari;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		 /*
//        Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
//        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
//        */

		
		Scanner scan= new Scanner(System.in);
		
		char karakter='a';
		while(karakter!='x') {
			System.out.println("Lutfen bir karakter giriniz");
			karakter=scan.next().charAt(0);
			if(karakter!='x') {
			System.out.println("Program calisiyor");
			}
			
		}
		System.out.println("Program bitti");
	}

}
