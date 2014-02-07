package com.excelonline.core.inheritance;

public class BabithaEmp extends Employee implements Smelling{
	
	public BabithaEmp(String name) {
		System.out.println("BabithaEmp.BabithaEmp()");
	}
	
	public BabithaEmp() {
//		this("");
		super("");
	}
	
	@Override
	public void wearTie() {
		System.out.println("BabithaEmp.wearTie()");
	}
	
	public void wearWatch(){
		System.out.println("Wear Black Color Watch...From Babitha");
	}
	public void singing(){
		System.out.println("BabithaEmp.singing()");
	}

	@Override
	public void smellCapacity() {
		System.out.println("BabithaEmp.smellCapacity() + 2 Meter");
		
	}
	
}