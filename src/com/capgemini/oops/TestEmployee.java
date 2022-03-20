package com.capgemini.oops;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Arun", 35000.0, 4500.0);
		Employee e = new Employee("aman",25000);
        m.displayEmployeeDetails();
        e.displayEmployeeDetails();
	}

}
