package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "     Bugün hava çok güzel.     ";
		System.out.println(mesaj);

//		System.out.println("Eleman sayısı :" + mesaj.length());
//		
//		System.out.println("5. eleman :" + mesaj.charAt(4));
//		
//		System.out.println(mesaj.concat(" Yaşasın!"));
//		
//		System.out.println(mesaj.startsWith("B"));
//		
//		System.out.println(mesaj.endsWith("."));
//		
//		//String içindeki karakter sayısını söyler.
//		//Stringteki istenilen indexteki elemanı getirir.
//		//String değere birleştirme yapar.
//		// B ile başlıyorsa true döndürür.
//		// . ile bitiyor mu? 
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);  //0'dan 5'e kadar olan indexteki karakterleri getirir.
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf('a')); //a'nın kaçıncı indexte olduğunu söyler. ilk bulduğunu verir.
//		System.out.println(mesaj.lastIndexOf('a')); //sağdan başlayarak e'yi arar. 
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		//Bir metnin içerisinden index numarasına göre karakterleri alır.
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		//" " Boşluğa göre kelimeleri ayır diyoruz. her 2 boşluk arasını bir kelime sanar.
		}
		
		System.out.println(mesaj.toLowerCase());
		// Tüm metni küçük harflerle yazar.
		System.out.println(mesaj.toUpperCase());
		// Tüm metni büyük harflerle yazar.
		System.out.println(mesaj.trim());
		//başındaki ve sonundaki boşlukları atar.
		
		
	}

}
