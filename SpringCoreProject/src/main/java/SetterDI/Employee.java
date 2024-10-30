package SetterDI;

import java.util.List;

public class Employee 
{
	private int id; // primitive
	private String name;   //non primitive
	private String gender;  //non primitive
	private double salary;  // primitive
	private boolean mstatus; // primitive
	private String location;  //non primitive
	private float age;  // primitive
	private List<String> skills;	//non primitive
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isMstatus() {
		return mstatus;
	}
	public void setMstatus(boolean mstatus) {
		this.mstatus = mstatus;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", mstatus="
				+ mstatus + ", location=" + location + ", age=" + age + ", skills=" + skills + "]";
	}
	
}
