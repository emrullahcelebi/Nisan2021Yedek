package while_sorulari;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * // Kullanıcı x girilene kadar ekrana "Program çalışıyor" yazan // ve x
		 * girildiğinde ise "Program bitti" yazan programı yazınız. //
		 */

		Scanner scan = new Scanner(System.in);

		char karakter = 'a';

		while (karakter >= 0) {

			System.out.println("Lutfen bir karakter giriniz");
			karakter = scan.next().toLowerCase().charAt(0);

			if (karakter != 'x') {
				System.out.println("Program calisiyor");
			} else {
				break;
			}

		}
		System.out.println("Program bitti");

	}

}
