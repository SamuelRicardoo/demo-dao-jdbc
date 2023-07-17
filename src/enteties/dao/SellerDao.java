package enteties.dao;

import java.util.List;

import enteties.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update (Seller obg);
	void deleteByld(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
