package com.excelonline.core.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectApp {
	public static void main(String[] args) {

		//no paramater
		Class noparams[] = {};

		//String parameter
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;

		//int parameter
		Class[] paramInt = new Class[1];	
		paramInt[0] = Integer.TYPE;

		try{
			//load the AppTest at runtime
			
			Class cls = Class.forName("info._7chapters.core.reflection.AppTest");
			Object obj = cls.newInstance();
			
			AppTest test = new AppTest();
			
			cls = test.getClass();
			cls.getDeclaredAnnotations();
			
			//call the printIt method
			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, null);

			//call the printItString method, pass a String param 
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("mkyong"));

			//call the printItInt method, pass a int param
			/*method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 123);

			//call the setCounter method, pass a int param
			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 999);

			//call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(obj, null);
*/
			Field field[] = cls.getFields();
			for(Field field2 : field) {
				System.out.println("ReflectApp.main()" + field2.getName());
			}
			
			Method methodArray[] = cls.getMethods();
			for(Method metho : methodArray) {
				System.out.println("ReflectApp.main() Methods : " + metho.getName());
			}
	
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
