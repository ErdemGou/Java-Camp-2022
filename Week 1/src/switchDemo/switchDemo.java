package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Güzel : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Geçtiniz");
			break;
		case 'E':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}
	}

}
