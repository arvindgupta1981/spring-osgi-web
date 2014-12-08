package rd.arv.service.bundleactivator;

import java.util.List;

import arv.db.dao.StudentDAO;
import arv.db.model.Student;

public class StudentDaoActivator {
	private StudentDAO studentDAO;
	public StudentDaoActivator(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void start() {
		 System.out.println("start");

		List<Student> students = studentDAO.getAllStudents();
		for(Student student : students) {
			System.out.println(student.getName());
		}
	}
	
	public void stop() {
		 System.out.println("stop");

	}
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	
}
