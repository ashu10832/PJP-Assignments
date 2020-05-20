package com.ashugupta.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashugupta.SpringIOC.Models.Mobile;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("MobileContext.xml");
        Mobile mobile = (Mobile) context.getBean("mobile");
        
        System.out.println(mobile);
    }
}
