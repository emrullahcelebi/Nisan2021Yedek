package for_sorulari;

public class Soru8 {
	/*
    A
    B B
    C C C
    D D D D
    E E E E E
    F F F F F F
    şekli yazdırınız
    */
	public static void main(String[] args) {
		int  harf = 65;
		
		for (int satir = 0; satir < 6; satir++) {//satir kontrolu
			for (int sutun = 0; sutun <= satir; sutun++) {//sutun kontrolu
				System.out.print((char)(harf+satir)+" ");
			}
			System.out.println();
		}


	}

}
