package for_sorulari;

import java.util.Scanner;


public class Soru5 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.
        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
            /*  *
                * *
                * * *
                * * * *
                * * * * *
                şeklini yazdırınız
                */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		for (int satir = 1; satir <= sayi; satir++) {//satir kontrolu
			for (int bosluk = sayi-satir; bosluk >=0; bosluk--) {//bosluk kontrolu
				System.out.print(" ");
			}
			for (int yildiz = 1; yildiz <=satir; yildiz++) {//yildiz kontrolu
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		for (int satir = 1; satir <= sayi; satir++) {//satir kontrolu
			
			for (int yildiz = 1; yildiz <=satir; yildiz++) {//yildiz kontrolu
				System.out.print("*");
			}
			System.out.println();
		
		
		
		
		
	}
	
			
	}
}
