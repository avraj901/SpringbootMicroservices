package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.bean.ToolBox;

public class BeanScopeTest {
	public static void main(String[] args) {

		ToolBox toolBox1 = null;
		ToolBox toolBox2 = null;
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
	      toolBox1=factory.getBean("toolBox", ToolBox.class);
	      toolBox2=factory.getBean("toolBox", ToolBox.class);
	      System.out.println("toolBox1 == toolBox2 ?"+(toolBox1 == toolBox2));
	}
}
