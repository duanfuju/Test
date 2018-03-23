package com.dfj;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dfj.entity.TsCustomer;


public class Test1 {
	public static void main(String[] args) {
		/*Object bean=new TsCustomer();
		Object beanInstance = null;
		try {
			beanInstance = bean.getClass().newInstance();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//bean.getClass().getField("name").set(obj, value);
		for(Field f : bean.getClass().getFields()){
			f.set(beanInstance, excelConfig.getConfigModel().getFields());
		}*/
		
		/*String sdf = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println(sdf);*/
		
		String type="ID12";
		System.out.println(type.contains("I"));
		
	}
}
