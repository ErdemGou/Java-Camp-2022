package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayi mevcuttur"+aranacak);
		} else {
			mesajVer("sayi mevcut degildir: " + aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
	
}
