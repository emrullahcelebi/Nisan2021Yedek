package for_sorulari;

public class Soru2 {
 /*  Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları 
        ekrana yazdırınız (büyükten küçüğe).
         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       
        */
	public static void main(String[] args) {
		

		int sayi=100;
		for(int i=sayi; i>0;i--) {
			if(i%13==0) {
				System.out.println(i);
			}
				
		}
	}

}
