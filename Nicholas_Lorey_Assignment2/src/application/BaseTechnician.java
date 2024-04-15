package application;
import java.util.ArrayList;

public abstract class BaseTechnician implements TechDetail{
	
	protected String name;
	protected String technicianId;
	protected double salary;
	
	public BaseTechnician() {
		
	}
	
	/**
	 * constructor for BaseTechnician
	 * @param name
	 * @param technicianId
	 * @param salary
	 */
	public BaseTechnician(String name, String technicianId, double salary) {
		this.name = name;
		this.technicianId = technicianId;
		this.salary = salary;
	}
	
	/**
	 * Display the csv file by using the csvReader class
	 */
	public void displayDetails() {
		
		
			System.out.printf("Technician ID: %s \n", technicianId);
			System.out.printf("Name: %s \n", name);
			System.out.printf("Salary: %.1f \n", salary);
			//System.out.printf("Calculated Salary: %.1f \n", s.calculateSalary());
			System.out.println();
		
		
		
	}

}
