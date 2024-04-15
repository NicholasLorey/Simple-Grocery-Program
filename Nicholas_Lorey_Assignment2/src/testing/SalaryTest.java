package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.FullTimeTechnician;
import application.PartTimeTechnician;

class SalaryTest {

	@Test
	void testFullTimeTechnicianSalary() {
		FullTimeTechnician testFullTime = new FullTimeTechnician();
		testFullTime.setSalary(45000);
		double test = testFullTime.calculateSalary();
		assertEquals(450500.0,test);
		//fail("Not yet implemented");
	}
	
	@Test
	void testPartTimeTechnicianSalary() {
		PartTimeTechnician testPartTime = new PartTimeTechnician();
		testPartTime.setSalary(45.8);
		double test = testPartTime.calculateSalary();
		assertEquals(1717.5,test);
		//fail("Not yet implemented");
	}

}
