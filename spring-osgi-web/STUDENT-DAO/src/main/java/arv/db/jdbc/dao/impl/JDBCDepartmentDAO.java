package arv.db.jdbc.dao.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import arv.db.dao.DepartmentDAO;
import arv.db.model.Department;

public class JDBCDepartmentDAO implements DepartmentDAO {

	@Override
	public Collection<Department> getAll() {
		List<Department> departments = new LinkedList<Department>();
		departments.add(new Department(1, "001", "Computers"));
		departments.add(new Department(2, "002", "Accounts"));
		return departments;
	}

	@Override
	public List<Department> getAllDepartments() {
		return (List)getAll();
	}

}
