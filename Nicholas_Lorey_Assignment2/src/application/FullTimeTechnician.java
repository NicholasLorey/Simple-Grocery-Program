package application;

public class FullTimeTechnician extends BaseTechnician{
	
	public FullTimeTechnician() {
		//default constructor
	}
	
	/**
	 * constructor with parameter for FullTimeTechnician
	 * @param name
	 * @param technicianId
	 * @param salary
	 */
	public FullTimeTechnician(String name, String technicianId, double salary) {
		super(name,technicianId,salary);
	}
	
	/**
	 * @return parent class salary
	 */
	public double calculateSalary() {
		return super.salary;
	}
	
	/**
	 * set the salary that we want in the parent class
	 */
	public void setSalary(double salary) {
		super.salary = salary;
	}

}
