package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orani";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7400);
		product1.setUnitsInStock(100);
		product1.setImageUrl("olamaz olamaz.jpg");

		Product product2 = new Product();
		// set value
		product2.setName("Vestel Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7400);
		product2.setUnitsInStock(100);
		product2.setImageUrl("olamaz olamaz.jpg");

		Product product3 = new Product();
		// set value
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7400);
		product3.setUnitsInStock(100);
		product3.setImageUrl("olamaz olamaz.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}

		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("054444444444");
		individualCustomer.setPhone("erdo");
		individualCustomer.setFirstName("erdo");
		individualCustomer.setLastName("köstek");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("hepsiburada");
		corporateCustomer.setPhone("0555555555551");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customer = {individualCustomer,corporateCustomer};
		
		

	}

}
