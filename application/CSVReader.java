package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	/**
	 * to read from CSV file and add the object into an arrayList  
	 * @param filePath
	 * @return an arrayList which contain a list of object of Partime and Fulltime
	 */
	public ArrayList<BaseTechnician> readTechnicians(String filePath) {
		
		ArrayList<BaseTechnician> techList = new ArrayList<>();

		String csv = filePath;
		
		String splitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader(csv));
			//br.readLine();
			while((csv=br.readLine())!=null) {
				String[]technician = csv.split(splitBy);
				String type = technician[0];
				String name = technician[1];
				String Id = technician[2];
				double salary = Double.parseDouble(technician[3]);
				if(type.equals("FullTime")) {
					FullTimeTechnician fullTime = new FullTimeTechnician(name, Id, salary);
					techList.add(fullTime);
				}
				else if(type.equals("PartTime")) {
					PartTimeTechnician partTime = new PartTimeTechnician(name, Id, salary);
					//double calculatedSalary = partTime.calculateSalary();
					techList.add(partTime);
					
				}
				
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return techList;
		
	}

}
