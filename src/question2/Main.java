package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter Employee Detailes");
			System.out.println("Enter Employee ID");
			int empID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name");
			String name=sc.nextLine();
			System.out.println("Enter Salary");
			double salary=sc.nextDouble();
			
			Employee employee=new Employee(empID,name,salary);
			
			System.out.println("Enter product Details");
			System.out.println("Enter Product ID");
			int pID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product price");
			double price=sc.nextDouble();
			System.out.println("Enter quantity");
			int quantity=sc.nextInt();
			
			Product product=new Product(pID,price,quantity);
			
			
			System.out.println("\n incomTax for Employee "+employee.calcTax());
			System.out.println("\n IncomTax for Product "+product.calcTax());
	sc.close();
	}
	
}
