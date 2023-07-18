
package application;

import java.util.Date;
import java.util.List;

import enteties.Department;
import enteties.Seller;
import enteties.dao.DaoFactory;
import enteties.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Department department = new Department(2, null);
		Seller seller=  new Seller(null, "Greg", "greg@Hotmail.com", new Date(), 4000.0, department);
		sellerDao.insert(seller);
		
		System.out.println("new id = " + seller.getId());
		
		
		List<Seller> list = sellerDao.findAll();
		
		//for(Seller obg: list) {
			//System.out.println(obg);
			//System.out.println(" ");
		}
		
	}
