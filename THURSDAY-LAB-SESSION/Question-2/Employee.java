class Employee {
	private String name;
	private short yearOfJoining;
	private double salary;
	private String address;
	
	public Employee(String name, short yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
	
	
	public String toString() {
		return name + "\t\t" + yearOfJoining + "\t\t   " + salary + "\t" + address;
	}



	public static void main(String[] args) {
		Employee e1 = new Employee("Rohit S Patil", (short)2021, 80000, "Kolhapur Maharashtra");
		Employee e2 = new Employee("Karan A Jadhav", (short)2018, 75000, "Mumbai Maharashtra");
		Employee e3 = new Employee("Omkar P Koli", (short)2015, 65000, "Sangali Maharashtra");
		
		System.out.println("Question: _______________________________________________________________________________________________________");
		System.out.println("Write a program that would print the information (name, year of joining, salary, address)\r\n"
				+ "of three employees by creating a class named 'Employee'. The output should be as\r\n"
				+ "follows:\r\n"
				+ "Name Year of joining Address\r\n"
				+ "Robert 1994 64C- WallsStreat\r\n"
				+ "Sam 2000 68D- WallsStreat\r\n"
				+ "John 1999 26B- WallsStreat");
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Solution: ");
		
		
		System.out.println("Employee Name \t Year of Joining \t Total Salary \t Address");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}
	
	

}
