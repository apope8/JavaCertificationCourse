package collections;

public class EmployeeCompareTo implements Comparable<EmployeeCompareTo> {
	String name;
	int salary;
	String department;
	public EmployeeCompareTo(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	//Tells java on which fields to compare employees in order to sort.
	//Another instance of the Employee class (o) is called and compared with "this" Employee class
	@Override
	public int compareTo(EmployeeCompareTo o) {
		if (this.salary < o.salary) {
			return -1;
		}
		else if (this.salary > o.salary) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "EmployeeCompareTo [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
	
}
