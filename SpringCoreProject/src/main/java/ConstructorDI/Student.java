package ConstructorDI;

import java.util.List;

public class Student 
{
	private int id;//primitive
	private String name;//non primitive
	private String gender;//non primitive
	private float age;//primitive
	private String department;//non primitive
	private boolean isGraduated;//primitive
	private List<String> certifications;//non primitive
	public Student(int id, String name, String gender, float age, String department, boolean isGraduated,
			List<String> certifications) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.department = department;
		this.isGraduated = isGraduated;
		this.certifications = certifications;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", department="
				+ department + ", isGraduated=" + isGraduated + ", certifications=" + certifications + "]";
	}
}
