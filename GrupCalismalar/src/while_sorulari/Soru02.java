package while_sorulari;

public class Soru02 {
	/*
	 * Problem Tanımı // Verilen iki sayının kombinasyonunu bulan kodu yazınız. //
	 * Hatırlatma C(n,r) = n! / (r!(n-r)!) 
	 * // Ekran Çıktısı 
	 * // Birinci sayıyı giriniz: 15
	 *  // Ikinci sayıyı giriniz: 4 
	 *  // Kombinasyon: 1365
	 *   // Birinci
	 * sayıyı giriniz: 5 
	 * // Ikinci sayıyı giriniz: 3 
	 * // Kombinasyon: 10
	 * 

//  */
	public static void main(String[] args) {

		int sayi1 = 5;
		int sayi2 = 3;
		int sayi3=(sayi1-sayi2);
		double n=1;
		double r=1;
		double c=1;
		
		int i=1;
		while(i<=sayi1) {
			
			n=i*n;
			
			i++;
		}
		
		
		int j=1;
		while(j<=sayi2) {
			
			r=j*r;
			
			j++;
		}
		
		int k=1;
		while(k<=sayi3) {
			
			c=k*c;
			
			k++;
		}
		
		System.out.println(r);
		System.out.println(n);
		System.out.println(c);
		//C(n,r) = n! / (r!(n-r)!)
		
		double kom=n/(r*c);
		
		System.out.println("("+sayi1+"+"+sayi2+")"+" sayilarinin kombinasyonu : "+kom);
		
		
		
	}

}
