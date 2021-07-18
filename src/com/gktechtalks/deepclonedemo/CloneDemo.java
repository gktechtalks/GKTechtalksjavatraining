package com.gktechtalks.deepclonedemo;

public class CloneDemo {
	
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Address address = new Address("LN Flat10","HYD","TEL","India");
		Employee empone = new Employee(1,"Krishna",address);
		
		System.out.println(" ==============Printing Employee Details First time ======");
		ShowEmployeeDetails(empone);
		System.out.println(" ==============End ======");
		
		Employee emptwo = (Employee) empone.clone();
		
		System.out.println(" ==============Printing Employee Details after clone from emptwo ======");
		ShowEmployeeDetails(emptwo);
		System.out.println(" ==============End print after clone======");
		
		emptwo.getAddress().setAddressLine("Line2");
		
		System.out.println(" ==============Printing Employee Details after change in clone from empone ======");
		//we changed addresslne - in deep copy there is no change in source object empone
		//we overridden the clone method in different way to do deepl cloning
		ShowEmployeeDetails(empone);
		System.out.println(" ==============End print after change in clone no effect in empone======");
		
	}

	private static void ShowEmployeeDetails(Employee employee) {
	
		System.out.println("Employee No -----> "+employee.getEmpNo());
		System.out.println("Employee Name -----> "+employee.getName());
		System.out.println("Employee  address line-----> "+employee.getAddress().getAddressLine());
		System.out.println("Employee city -----> "+employee.getAddress().getCity());
		System.out.println("Employee state -----> "+employee.getAddress().getState());
		System.out.println("Employee country -----> "+employee.getAddress().getCountry());
		
	}

}
