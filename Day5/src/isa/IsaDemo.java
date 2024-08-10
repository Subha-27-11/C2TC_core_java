package isa;

public class IsaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
