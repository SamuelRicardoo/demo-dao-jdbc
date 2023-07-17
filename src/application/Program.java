package application;

import java.util.List;

import enteties.Department;
import enteties.Seller;
import enteties.dao.DaoFactory;
import enteties.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller= sellerDao.findById(2);
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obg: list) {
			System.out.println(obg);
			System.out.println(" ");
		}
		
	}

}
