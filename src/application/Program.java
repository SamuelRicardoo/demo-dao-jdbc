package application;

import java.util.Date;

import enteties.Department;
import enteties.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department departmant = new Department(1, "Book");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 300.0, departmant);
		
		System.out.print(seller);
		
	}

}
