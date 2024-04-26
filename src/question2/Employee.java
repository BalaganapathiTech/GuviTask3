package question2;
public class Employee implements Taxable {

	private int empID;
	private String name;
	private double salary;

public Employee(int empID,String name,double salary) {
	this.empID=empID;
	this.name=name;
	this.salary=salary;
	
}
public double calcTax() {
	return salary*incomeTax;
}

}
