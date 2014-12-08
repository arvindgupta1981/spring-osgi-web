package arv.db.model;

public class Student {
	private Integer id;
	private String code;
	private String name;
	private Department department;
	
	public Student(Integer id, String code, String name, Department department) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.department = department;
	}
	
	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
