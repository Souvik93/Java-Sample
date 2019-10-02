package demo;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private String employerName;
	private int salary;
	
	public Employee(String name, String employerName, int salary) {
		super();
		this.name = name;
		this.employerName = employerName;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employerName=" + employerName + ", salary=" + salary + "]";
	}

	// @Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return arg0.getEmployerName().compareTo(arg1.getEmployerName());
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.salary-arg0.getSalary();
	}
	
	
	
	

}
