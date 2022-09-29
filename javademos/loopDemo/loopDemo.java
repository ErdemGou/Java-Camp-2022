package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// for
		// Döngüyü kurma formülü : for (değişken/sayaç tanımı ; şart bloğun ; değişkeni
		// değiştir)
		// Şart sağlandığı sürece for içindeki kod bloğu çalışır.

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		//çalısma mantik
		// 1. dönüm : i=1 ve i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki
		// koda göre ekrana i (1) yaz.
		// 2. dönüm : i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki koda
		// göre ekrana i (2) yazdır.
		// 3. dönüm : i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki koda
		// göre ekrana i (3) yaz.
		// ..
		// son Dönüm : i 10'dan küçük mü? hayır. o zaman döngüyü bitir ve döngüden çık.
		// döngüdeki ilk değişken tanımından sonra o kod bir daha calışmaz.
		// Yani i = 1 dedikten sonra birdahaki adımlarda i'yi 1'e eşitlemez sadece başta
		// i'yi tanır ve bidaha o kod çalışmaz.

		// i+=2 >>>> i=i+2; demektir. Art arda toplama. i++ = i'yi 1 arttır demektir.
		
		int i = 1;
		//while
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		
		//Do - while 
		int j = 1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		
		System.out.println("Do ve While döngüsü");
		
		
	}

}
