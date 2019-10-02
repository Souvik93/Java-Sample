package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
	
	public void comparatorExample() {
		ArrayList al = new ArrayList<Employee>();
		al.add(new Employee("Souvik Das","Deutsche Bank",610000));
		al.add(new Employee("Ashutosh Singla","UBS",1050000));
		al.add(new Employee("Sharuti Sharma","Infosys",512000));
		Collections.sort(al);
		
		ArrayList<Employee> cal = new ArrayList<Employee>(al);
		cal.sort(Employee.NameComparator);
		System.out.println("Final ArrayList al");
		System.out.println(al);
		System.out.println("Final ArrayList cal");
		System.out.println(cal);
		
	}

}
