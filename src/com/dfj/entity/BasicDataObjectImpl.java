package com.dfj.entity;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dfj on 2017/7/21 0021.
 */
public class BasicDataObjectImpl implements IBasicDataObject{
	 protected transient BasicDataObjectImpl bc = setBC();
	 protected transient Map<String, Object> instanceProperties;
	 protected  BasicDataObjectImpl setBC() {
        return this;
    }
	 /**
	  * 获取子类的属性
	  * @return
	  */
	 public Map<String, Object> getInstanceProperties() {
        Class<?> clazz = this.bc.getClass();
        do {
            Field[] fields = clazz.getDeclaredFields();
            instanceProperties=new HashMap<String, Object>();
            for (int i = 0; i < fields.length; i++) {
            	Field f =fields[i];
            	String name=f.getName();
            	 int[] num=new int[name.length()];
    			 char[] ch=name.toCharArray();
    			 for (int j = 0; j < ch.length; j++) {
    					if (ch[j]=='_') {
    						num[j]=j+1;
    						 if(ch[num[j]] >= 'a' && ch[num[j]] <= 'z'){
    					         ch[num[j]] = (char)(ch[num[j]] - 32);
    					     }
    					}
    				}
    			 name=new String(ch).replaceAll("_", "");
            	instanceProperties.put(name,"");
			}
            clazz = clazz.getSuperclass();
        } while (clazz != BasicDataObjectImpl.class);
        return this.instanceProperties;
    }
	 
	 /**
	  * 设置指定属性的值
	  * @param key
	  * @param value
	  */
	 public void set(String key,Object value){
		 for (int i = 0; i < instanceProperties.size(); i++) {
			if (instanceProperties.containsKey(key)) {
				instanceProperties.put(key,value);
				break;
			}
		}
	 }
	 /**  
	     * 将一个 Map 对象转化为一个 JavaBean  
	     * @param type 要转化的类型  
	     * @param map 包含属性值的 map  
	     * @return 转化出来的 JavaBean 对象  
	     * @throws IntrospectionException 如果分析类属性失败  
	     * @throws IllegalAccessException 如果实例化 JavaBean 失败  
	     * @throws InstantiationException 如果实例化 JavaBean 失败  
	     * @throws InvocationTargetException 如果调用属性的 setter 方法失败  
	     */    
	    public  Object convertMap(Class type)    
	            throws IntrospectionException, IllegalAccessException,    
	            InstantiationException, InvocationTargetException {    
	        BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性    
	        Object obj = type.newInstance(); // 创建 JavaBean 对象    
	    
	        // 给 JavaBean 对象的属性赋值    
	        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();    
	        for (int i = 0; i< propertyDescriptors.length; i++) {    
	            PropertyDescriptor descriptor = propertyDescriptors[i];    
	            String propertyName = descriptor.getName();    
	            if (instanceProperties.containsKey(propertyName)) {    
	                // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。    
	                try {
						Object value = instanceProperties.get(propertyName);    
   
						Object[] args = new Object[1];    
						if (value.equals("")||value.equals("0")
								||Integer.valueOf((String) value)==0) {
							args[0] = null;    
						}else{
							args[0]=value;
						}
   
						descriptor.getWriteMethod().invoke(obj, args);
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}    
	            }    
	        }    
	        return obj;    
	    }  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* public void getValueByFieldName(){  
		 for (int i = 0; i < instanceProperties.size(); i++) {
			 Property property=instanceProperties.get(i);
			 String fieldName=property.getName();
			 String firstLetter=fieldName.substring(0,1).toUpperCase();  
			
	         String setter = "set"+firstLetter+fieldName.substring(1);  
	         int[] num=new int[setter.length()];
			 char[] ch=setter.toCharArray();
			 for (int j = 0; j < ch.length; j++) {
					if (ch[j]=='_') {
						num[j]=j+1;
						 if(ch[num[j]] >= 'a' && ch[num[j]] <= 'z'){
					         ch[num[j]] = (char)(ch[num[j]] - 32);
					     }
					}
				}
			 setter=new String(ch).replaceAll("_", "");
		        try {  
		            Method method = this.bc.getClass().getMethod(setter, new Class[]{});  
		           // System.out.println(method.getName());
		            Object value = method.invoke(this.bc.getClass(), new Object[] {});    
		            System.out.println(value);
		        } catch (Exception e) {  
	        }   
		}
	  }  */
}
