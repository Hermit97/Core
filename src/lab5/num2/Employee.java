public class Employee extends Person{
	private double payRate;
	private double hoursWorked;
	private String deparment;
	
	private final int HOURS = 40;
	private final double OVERTIME = 1.5;
	
	//Default constructor
	public Employee(){
		super();
		payRate = 0;
		hoursWorked = 0;
		deparment = "";
	}

	//Alternate constructor 
	public Employee(String firstName, String lastName, double payRate, double hoursWorked, String deparment){
		super(firstName, lastName);
		
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
		this.deparment = deparment;
	}

	public void setPayRate(double payRaye){
		this.payRate = payRaye;
	}

	public void sethoursWorked(double hoursWorked){
		this.hoursWorked = hoursWorked;
	}

	public void setDepartment(String deparment){
		this.deparment = deparment;
	}

	public double getPayRate(){
		return payRate;
	}

	public double getHoursWorked(){
		return hoursWorked;
	}

	public String getDept(){
		return deparment;
	}

	public String toString(){
		return "The wages for " + super.toString() + "from " + this.deparment + " department are " + calculateWage();
	}

	public void print(){
		System.out.println("The employe" + super.toString() + " from the department" + deparment);
	}
	
	public double calculateWage(){
		double regularPay = payRate * HOURS;
		double totalWage = regularPay * OVERTIME;
		return totalWage;
	}

	public boolean equals(Object obj){
		if(obj instanceof Employee){
			Employee e = (Employee) obj;
			return payRate == (e.payRate) && hoursWorked == (e.hoursWorked) && deparment.equals(e.deparment);
		}else
			return false;
	}

	public Employee getCopy(){
		return new  Employee(super.getFirstName(), super.getLastName(), payRate, hoursWorked, deparment);
	}

	public void copy(Employee e){
		payRate = e.payRate;
		hoursWorked = e.hoursWorked;
		deparment = e.deparment;

	}
}
