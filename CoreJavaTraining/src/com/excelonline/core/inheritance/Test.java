package com.excelonline.core.inheritance;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object emp = new JayramEmp();
//		Jumpable empJummp = new JayramEmp();
//		emp.wearTie();
//		emp.wearWatch();
//		emp.smellCapacity();
//		empJummp.jump();
//		System.out.println("Test.main()" + emp.name);
		
		Employee emp1 = new JayramEmp();
		
		Employee jayemp = new JayramEmp();
		jayemp.wearTie();
		jayemp.wearWatch();
		
//		emp.singing();
	}
}