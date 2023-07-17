package application;

import enteties.Seller;
import enteties.dao.DaoFactory;
import enteties.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller= sellerDao.findById(2);
		
		System.out.print(seller);
		
	}

}
