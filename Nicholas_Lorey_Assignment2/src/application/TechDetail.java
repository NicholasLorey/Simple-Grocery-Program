package application;

public interface TechDetail {
	
	/**
	 * Method that will be used by FullTime and PartTime technician 
	 */
	
	public void displayDetails();
	
	public double calculateSalary();
	
	public void setSalary(double salary);

}
