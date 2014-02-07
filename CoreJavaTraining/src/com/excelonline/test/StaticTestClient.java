package com.excelonline.test;

//import info._7chapters.core.test.mytest.MyPackageTest;

import static com.excelonline.core.test.mytest.MyPackageTest.MYPackageStr;
import static com.excelonline.core.test.mytest.MyPackageTest.MYPackageStr2;

import com.excelonline.core.test.mytest.MyPackageTest;

public class StaticTestClient {
	public static void callMe(){
//		System.out.println("StaticTestClient.main()"+ MYPackageStr);	
	}
	
	public static void main(String...arg){
//		
//		StaticTestClient tc = new StaticTestClient();
//		tc.callMe();
//		
//		StaticTest stat1 = new StaticTest();
//		System.out.println("StaticTestClient.main()" + (stat1.myInt++) +" " + (stat1.i++));
//		
//		StaticTest stat2 = new StaticTest();
//		System.out.println("StaticTestClient.main()" + (stat2.myInt++) +" " + (stat2.i++));
//		
//		StaticTest stat3 = new StaticTest();
//		System.out.println("StaticTestClient.main()" + (stat3.myInt++) +" " + (stat3.i++));
		
		StaticTest st = new StaticTest();
		System.out.println("StaticTestClient.main()"+ st.MYTEST_VAR);
		
//		MyPackageTest pt = new MyPackageTest();
//		System.out.println("StaticTestClient.main()"+ pt.MYPackageStr);
		
		System.out.println("StaticTestClient.main()"+ MYPackageStr);
		System.out.println("StaticTestClient.main()"+ MYPackageStr2);
		MyPackageTest mypack = new MyPackageTest();
		System.out.println("StaticTestClient.main()"+ mypack.MYPackageStr1);
	}
}