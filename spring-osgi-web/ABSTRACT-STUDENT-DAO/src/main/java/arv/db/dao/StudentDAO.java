package arv.db.dao;

import java.util.List;

import arv.db.model.Student;

public interface StudentDAO extends GenericDAO<Student> {
	List<Student> getAllStudents();
}
