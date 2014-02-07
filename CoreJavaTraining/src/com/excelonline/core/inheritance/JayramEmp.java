package com.excelonline.core.inheritance;

public class JayramEmp extends Employee implements Jumpable  , Smelling{
	@Override
	public void jump() {
		System.out.println("I can jump 3 feet" + name);
		
	}
	@Override
	public void wearTie() {
		System.out.println("JayramEmp.wearTie() Blue Tie");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BobarManAnimal dog = new BobarManAnimal();
	}
	@Override
	public void smellCapacity() {
		System.out.println("JayramEmp.smellCapacity() 1 meter");
		
	}
	
	protected void finalize( )
	{
		
	}

}