package while_sorulari;

public class Soru26 {

	public static void main(String[] args) {
		/*
		 * Bir top 220m yükseklikten atılmaktadır. Atıldıktan sonra, atıldığı
		 * yüksekliğin ¾ ü kadar yerden yukarı doğru zıplamaktadır
		 * Top zıplama yüksekliği 1 metrenin altına indiğinde durmaktadır. 
		 * Bu ana kadar aldığı yolu ve yere vurma sayısını bulunuz.
		 */
		double toplamZiplama=220;
		double ilkYukseklik=220;
		int count=0;
		while(ilkYukseklik>=1) {
			
			ilkYukseklik=(ilkYukseklik*0.75);
			//System.out.println(ilkYukseklik);
			toplamZiplama+=(ilkYukseklik*2);
			count++;
		}
		System.out.println("Toplam ziplama sayisi : "+count);
		System.out.println("Ziplanilan toplam yol : "+ (toplamZiplama));
	}

}
