package application;

public class PartTimeTechnician extends BaseTechnician{
	
	public PartTimeTechnician() {
		//default constructor
	}
	
	
	/**
	 * constructor with parameter for PartTimeTechnician 
	 * @param name
	 * @param technicianId
	 * @param hourlyRate
	 */
	public PartTimeTechnician(String name, String technicianId, double hourlyRate) {
		super(name,technicianId,hourlyRate);
	}
	
	/**
	 * @return parent class salary by multiply 37.5
	 */
	public double calculateSalary() {
		return super.salary*37.5;
	}
	
	/**
	 * set the salary that we want in the parent class
	 */
	public void setSalary(double hourlyRate) {
		super.salary = hourlyRate;
	}

}
