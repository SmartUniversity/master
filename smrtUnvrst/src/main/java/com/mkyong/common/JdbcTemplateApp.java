package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.UserDAO;

public class JdbcTemplateApp 
{
    public static void main( String[] args )
    {
    	//if you have time, 
    	//it's better to create an unit test rather than testing like this :)
    	
    	 ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
         
         UserDAO test = (UserDAO) context.getBean("userDAO");
         test.insert("1", "1", 1, "1", 1, "1");
         System.out.println(test.findTotalCustomer());
    	 
         
       
    }
}
