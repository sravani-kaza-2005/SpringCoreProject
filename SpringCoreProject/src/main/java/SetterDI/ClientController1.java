package SetterDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController1 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = context.getBean("empbean", Employee.class); //object will be created at runtime 
		System.out.println(emp.toString());
		//ue getter methods to print properties indivisually
		System.out.println("Employee Name:- "+emp.getName());
		context.close();
		
	}
}
