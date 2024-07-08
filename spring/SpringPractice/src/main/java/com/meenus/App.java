package com.meenus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj=(Alien) context.getBean("alien",Alien.class);
        obj.code();

        System.out.println(obj.getAge());
        System.out.println( "Hello World!" );
    }
}
