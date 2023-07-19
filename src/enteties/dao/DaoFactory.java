package enteties.dao;

import db.DB;
import enteties.dao.impl.DepartmentDaoJDBC;
import enteties.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDaoJDBC creatDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
	
}
