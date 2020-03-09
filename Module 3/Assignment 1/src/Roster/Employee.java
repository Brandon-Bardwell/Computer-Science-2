package Roster;

public class Employee extends Person {

	
	
	
	
	
	
	
	
	protected double salary;
	protected String office;
	

	public Employee(String name) {
		this(name, 0, "none");
	}

	public Employee(String name, double salary, String office) {
		super(name);
		this.salary = salary;
		this.office = office;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	

	

	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}


