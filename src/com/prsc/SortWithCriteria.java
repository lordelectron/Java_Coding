package com.prsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Employee model class have employee id, name and salary
 */

class Employee {
	public Long empId;
	public String name;
	public Long salary;

	public Employee(Long empId, String name, Long salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	

	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}

///**
// * 
// * Employee Sorting WithEmployeeId
// */
//class EmployeeSortingWithEmployeeId implements Comparator<Employee> {
//	/**
//	 * This method is using to compare between two employees Id
//	 */
//	@Override
//	public int compare(Employee employee, Employee otheremployee) {
//		// TODO Auto-generated method stub
//		if (employee.empId > otheremployee.empId) {
//			return 1;
//		}
//		if (employee.empId == otheremployee.empId) {
//			return 0;
//		} else {
//			return -1;
//		}
//
//	}
//}
//
///**
// * 
// * Employee Sorting With Employee Salary
// */
//class EmployeeSortingWithEmployeeSalary implements Comparator<Employee> {
//	/**
//	 * This method is using to compare between two employees salary
//	 */
//	@Override
//	public int compare(Employee employee, Employee otheremployee) {
//		if (employee.salary > otheremployee.salary) {
//			return 1;
//		}
//		if (employee.salary == otheremployee.salary) {
//			return 0;
//		} else {
//			return -1;
//		}
//
//	}
//}


/**
 * 
 * Employee Sorting With Employee Name
 */
class EmployeeSortingWithEmployeeName implements Comparator<Employee> {
	/**
	 * This method is using to compare between two employees name
	 */
	@Override
	public int compare(Employee employee, Employee otheremployee) {
		return employee.name.compareTo(otheremployee.name);

	}
}

/**
 * 
 * Menu for sorting
 */
public class SortWithCriteria {

	public static void main(String args[]) {
		List<Employee> listOfEmployee = new ArrayList<>();
		while (true) {
			System.out.println("Sorting as per your choices");
			System.out.println("1> Sort by employee id");
			System.out.println("2> Sort by employee name");
			System.out.println("3> Sort by employee salary ");
			System.out.println("4> Exit ");
			System.out.println();
			System.out.println("Please enter any one choice:> ");
			Scanner sc = new Scanner(System.in);
			Integer choice = sc.nextInt();
			switch (choice) {
			case 1:
				listOfEmployee = createListofEmployee();
				Comparator<Employee> employeeEmpIdComparator
				= Comparator.comparingLong(Employee::getEmpId);
				 Arrays.sort(listOfEmployee.toArray());
				System.out.println(listOfEmployee);
				listOfEmployee.clear();
				break;
			case 2:
				listOfEmployee = createListofEmployee();
			//ollections.sort(listOfEmployee, new EmployeeSortingWithEmployeeName());
				 Comparator<Employee> nameComparator =
				 Comparator.comparing(Employee::getName);
				System.out.println(listOfEmployee);
				listOfEmployee.clear();
				break;
			case 3:
				listOfEmployee = createListofEmployee();
				Comparator<Employee> employeeSalaryComparator
				= Comparator.comparingLong(Employee::getSalary);
				System.out.println(listOfEmployee);
				listOfEmployee.clear();
				break;

			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong choice-----------------");

			}
		}

	}

	/**
	 * To create employees
	 */
	private static List<Employee> createListofEmployee() {
		List<Employee> employeeDetailslist = new ArrayList<>();
		employeeDetailslist.add(new Employee(123L, "Amal", 30000L));
		employeeDetailslist.add(new Employee(321L, "Abir", 29800L));
		employeeDetailslist.add(new Employee(224L, "Tathagata", 51000L));
		employeeDetailslist.add(new Employee(320L, "Biswajit", 299900L));
		employeeDetailslist.add(new Employee(321L, "Kashyap", 10000L));
		employeeDetailslist.add(new Employee(221L, "Archana", 40000L));
		employeeDetailslist.add(new Employee(121L, "Yuvraj", 6000L));
		return employeeDetailslist;
	}
	
   
   

}
