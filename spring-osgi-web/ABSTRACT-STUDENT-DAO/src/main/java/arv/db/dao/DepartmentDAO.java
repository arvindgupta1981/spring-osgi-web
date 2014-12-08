package arv.db.dao;

import java.util.List;

import arv.db.model.Department;

public interface DepartmentDAO extends GenericDAO<Department> {
    /*List<Department> getByDrugName(String drugName);
    Department getByGenericName(String genericName);
    List<Department> getByDrugGroupID(String drugGroupID);*/
	List<Department> getAllDepartments();
}