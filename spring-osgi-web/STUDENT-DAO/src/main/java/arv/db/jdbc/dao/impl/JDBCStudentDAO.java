package arv.db.jdbc.dao.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import arv.db.dao.StudentDAO;
import arv.db.model.Department;
import arv.db.model.Student;

public class JDBCStudentDAO implements StudentDAO {

	@Override
	public Collection<Student> getAll() {
		List<Student> students = new LinkedList<Student>();
		students.add(new Student(1, "001", "Arvind", new Department(1, "001", "Computers")));
		students.add(new Student(2, "002", "Kamal", new Department(1, "001", "Computers")));
		return students;
	}

	@Override
	public List<Student> getAllStudents() {
		return (List)getAll();
	}

	
	
}
