package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1	,"laptop","Asus", 3000,2,"Siyah");
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus");
//		product.setPrice(5000);
//		product.setStockAmount(12);
//		product.setRenk("Kırmızı");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

		System.out.println(product.getKod());

	}

}