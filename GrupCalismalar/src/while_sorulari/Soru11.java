package while_sorulari;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       // tamkare ise true  değilse false yazdırınız.
       // 16 -> evet,  
		//5 -> hayır

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tam sayi giriniz");
		int sayi = scan.nextInt();
		//5*5 =25
		int count=1;
		int aranan=0;
		while(count<sayi) {
				if(sayi==count*count) {
					aranan=count;
					break;
				}
			count++;
		}
		if(aranan>0) {
		System.out.println(sayi +" "+aranan+"'nin tam karesidir");	
		}else {
			System.out.println(sayi +" tam kare degildir");
		}
		scan.close();
	}

}
