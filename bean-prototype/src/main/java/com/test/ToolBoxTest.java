package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.ToolBox;

public class ToolBoxTest {

	public static void main(String[] args) {
		ToolBox toolBox1=null;
		ToolBox toolBox2=null;
		BeanFactory beanFectory=new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
	         toolBox1=beanFectory.getBean("toolBox", ToolBox.class);
	         toolBox2=beanFectory.getBean("toolBox",ToolBox.class);
	         System.out.println("toolBOx1 == toolBOx2 ? "+(toolBox1 == toolBox2));
	}
}
