
package application;

import java.util.Scanner;

import enteties.Department;
import enteties.Seller;
import enteties.dao.DaoFactory;
import enteties.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Department department = new Department(2, null);
		Seller seller=  new Seller();
		
		int id = sc.nextInt();
		sellerDao.deleteByld(id);
		sc.close();
		
		//for(Seller obg: list) {
			//System.out.println(obg);
			//System.out.println(" ");
		}
		
	}
