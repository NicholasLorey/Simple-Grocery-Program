package application;

import java.util.ArrayList;

public class TechnicianDriver {

	/**
	 * This is where we initiate the object and call the method to print the csv file
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = "D:\\Eclipse_Workspace\\Lab_Activity\\Nicholas_Lorey_Assignment2\\data\\technicians.csv";
		CSVReader read = new CSVReader();
		ArrayList<BaseTechnician> technician = read.readTechnicians(filePath);
		for(BaseTechnician s: technician) {
			s.displayDetails();
			s.calculateSalary();
		}
		//BaseTechnician baseTechnician = new FullTimeTechnician();
		//baseTechnician.displayDetails();

	}

}
