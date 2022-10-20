
public class Main {

	public static void main(String[] args) {
		/*
		int sayi1=10;
		int sayi2=20;
		
		
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		*/
		
		//-------------------------------
		
		/*
		int[] sayilar1 = {1,2,3,4,5,6};
		int[] sayilar2 = {1,2,3,4,5,6};
		sayilar1 = sayilar2;
		sayilar1[0] = 100;
		System.out.println(sayilar1[0]);
		*/
		
		//-------------------------------
		
		
		/*
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		
		
		Customer customer = new Customer();
		customer.Id = 1;
		customer.City = "Ankara";
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		
		Company company = new Company();
		company.TaxNumber = "1234545";
		company.CompanyName = "Bosch";
		company.Id = 12;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.FirstName = "Ahmet";
		person.NationalIdentity = "123456";
		*/
		
		//----------------------
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	
	
	}

}
