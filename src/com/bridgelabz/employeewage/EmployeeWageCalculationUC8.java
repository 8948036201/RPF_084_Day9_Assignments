package com.bridgelabz.employeewage;

public class EmployeeWageCalculationUC8 {
	
	public static void main(String[] args) {
		
		EmployeeWageUC8Employee infosysEmp = new EmployeeWageUC8Employee("Infosys", "Azhar", 6, 18, 22, 50);
		int infosysEmpWage = infosysEmp.calculateEmpWage();
		System.out.println(infosysEmp.empName + " is working with " + infosysEmp.companyName + ", and he is earning "
				+ infosysEmpWage + "$ monthly");
		
		EmployeeWageUC8Employee wiproEmp = new EmployeeWageUC8Employee("Wipro", "Priyanka", 10, 18, 30, 80);
		int wiproEmpWage = wiproEmp.calculateEmpWage();
		System.out.println(wiproEmp.empName + " is working with " + wiproEmp.companyName + ", and he is earning "
				+ wiproEmpWage + "$ monthly");
		
		EmployeeWageUC8Employee dmartEmp = new EmployeeWageUC8Employee("DMart", "John", 8, 20, 20, 60);
		int dmartEmpWage = dmartEmp.calculateEmpWage();

		System.out.println(dmartEmp.empName + " is working with " + dmartEmp.companyName + ", and he is earning "
				+ dmartEmpWage + "$ monthly");

		EmployeeWageUC8Employee rILEmp = new EmployeeWageUC8Employee("Reliance", "Tony", 9, 15, 25, 80);
		int rILEmpWage = rILEmp.calculateEmpWage();
		System.out.println(rILEmp.empName + " is working with " + rILEmp.companyName + ", and he is earning "
				+ rILEmpWage + "$ monthly");
		
	}
}
