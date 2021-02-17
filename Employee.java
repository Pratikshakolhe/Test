package test;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	
	

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		
	}
	
	@Override
	public String toString() {
		return firstName+" "+" "+lastName;
		
	}
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Sam","Kohli");
		Employee e2=new Employee("Smith","kolhe");
		Employee e3=new Employee("Sachin","Das");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
		

	}

}
