package classes;

public class CustomerManager {
	public void Add() {
		System.out.println("Müsteri eklendi ");
	}
	public void Remove() {
		System.out.println("Müsteri Silindi ");
	}
	public void Update() {
		System.out.println("Müsteri Güncellendi ");
	}
	public void Gather(int sayi1,int sayi2) {
		int total = 0;
		total = sayi1 + sayi2;
		System.out.println("İşlemin Sonucu: "+total);
		
	}
}
