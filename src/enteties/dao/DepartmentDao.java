package enteties.dao;

import java.util.List;

import enteties.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update (Department obj);
	void deleteByld(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
		
}
