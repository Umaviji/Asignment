package com;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeDetails {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContent.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		Employee emp =(Employee)fac.getBean("empbean");
		emp.display();
		
	}

}
