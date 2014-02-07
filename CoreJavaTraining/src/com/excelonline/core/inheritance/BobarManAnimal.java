package com.excelonline.core.inheritance;

public class BobarManAnimal implements Jumpable , Smelling{
	
	public void jump() {
		System.out.println("Jump upto 10 feet");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void smellCapacity() {
		System.out.println("BobarManAnimal.smellCapacity() is 100 meter");
	}

}
