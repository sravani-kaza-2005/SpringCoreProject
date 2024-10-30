package ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController2
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student stu =  (Student) context.getBean("stubean");
		System.out.println(stu.toString());
		context.close();
	}
}
