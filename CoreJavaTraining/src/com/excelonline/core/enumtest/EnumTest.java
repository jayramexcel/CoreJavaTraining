package com.excelonline.core.enumtest;

enum CoffeeSize{
	SMALL,BIG,LARGE{
		public String getCode(){
			return "L";
		}	
	};
	
	public String getCode(){
		return "N";
	}
};

enum MYSCHOOL{
	SEC_A,SEC_B,SEC_C
};


public class EnumTest {
	
	public static void main(String[] args) {
		CoffeeSize size = CoffeeSize.BIG;
		System.out.println("EnumTest.main()" + 
		size.getCode() + " "
				+ ""+ CoffeeSize.LARGE.getCode() + " "
						+ ""+ CoffeeSize.SMALL.getCode() );
		
		Months mon = Months.JAN;
		System.out.println("EnumTest.main()" + mon);
//		for(Months mons : Months.values())
//			System.out.println("EnumTest.main()" + mons);
//		System.out.println("MYSCHOOL.SEC = "+ MYSCHOOL.SEC_A);
		
//		getMonths(Months.JAN);
//		getMonths(3);
	}
	public static void getMonths(Months mon){
		System.out.println("EnumTest.getMonths()"+mon.getMonth());
	}
	
	/*public static void getMonths(int monthId){
		if(1 == monthId){
			System.out.println("January");
		}else if(2 == monthId) {
			System.out.println("Feb");
		}
	}*/
}