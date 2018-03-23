package com.dfj;

import java.lang.reflect.Field;

import com.dfj.entity.TsCustomer;


public class Test2 {
	public static void main(String[] args) {
		   String regex="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
		String value="180213255911"; 
		 System.out.println(((String) value).matches(regex));
		
	}
}
