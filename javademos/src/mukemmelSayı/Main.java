package mukemmelSayı;

public class Main {

	public static void main(String[] args) {
		int number = 8128;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (number == total) {
			System.out.println("mükemmel sayidir");
		} else {
			System.out.println("mükemmel sayi degildir");
		}
	}

}
