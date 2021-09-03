package java8Task7;

class Employee {
	private String name;
	private String account;
	private int salary;

	Employee() {
		System.out.println("Constructor Without Parameters");
	}

	Employee(String name, String account, int salary) {
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String toString() {
		return "Employee Details: " + name + " | " + account + " | " + salary;
	}
	
	public static void main(String[] args) {
		EmployeeDetailsWithoutParameters empWithoutParams = Employee::new;
		System.out.println(empWithoutParams.getEmployee());
		
		EmployeeDetailsWithParameters empWithParams = Employee::new;
		System.out.println(empWithParams.getEmployee("Sikander", "Technology", 10000000));
	}
}
