package for_sorulari;


public class Soru7 {
	 /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız. A=65 ascii
    */
	public static void main(String[] args) {
		int  harf = 65;
		
		for (int satir = 0; satir < 6; satir++) {//satir kontrolu
			for (int sutun = 0; sutun <= satir; sutun++) {
				System.out.print((char)(harf+sutun)+" ");
			}
			System.out.println();
		}

	}

}
