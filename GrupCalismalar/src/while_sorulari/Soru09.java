package while_sorulari;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {

		/*
		 * Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana
		 * yazdırınız. girilen sayı dahil
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tam sayi giriniz");
		int sayi = scan.nextInt();
		System.out.print("Girilen sayidan O'a kadar olan tek sayilar: ");
		while (sayi > 0) {
			
				if (sayi % 2 != 0) {
					System.out.print(sayi+ " ");
				}
				sayi--;
			}
scan.close();
	}

}
