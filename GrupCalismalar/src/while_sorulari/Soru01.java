package while_sorulari;

public class Soru01 {
/*  Problem Tanımı
//        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
//        hespalayan fonksiyonu yazınız.
//        Örnek Ekran Çıktıları
//        Bir sayi giriniz: 6
//        Faktöriyeli: 720
//        Bir sayı giriniz: 3
//        Faktöriyeli 6
//     */

	public static void main(String[] args) {
		
		
		
		//6!=6*5*4*3*2*1
		
		int sayi=6;
		
		int faktoriyel=1;
		int i=1;
		while(i<=sayi) {//1,2,3,4,5,6

			faktoriyel=i*faktoriyel;
		//System.out.println(faktoriyel);
			i++;
		}
		System.out.println(sayi+" nin faktoriiyeli = "+faktoriyel);
	}

}
