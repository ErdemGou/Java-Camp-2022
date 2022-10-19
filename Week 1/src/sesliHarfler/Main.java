package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'B';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf+" kalin sesli harf");
			break;
		case 'E':
		case 'Ü':
		case 'Ö':
		case 'İ':
			System.out.println(harf+" ince sesli harf");
			break;
		default:
			System.out.println("Lütfen harf giriniz");
		}
	}
}
