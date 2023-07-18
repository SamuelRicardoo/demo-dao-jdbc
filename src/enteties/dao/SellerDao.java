package enteties.dao;

import java.util.List;

import enteties.Department;
import enteties.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update (Seller obj);
	void deleteByld(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
