package org.example.AssignmentQ8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) { 
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AssignmentQ4.xml");
        XmlBeanLifeCycle obj = (XmlBeanLifeCycle) context.getBean("XML1");

        System.out.println(obj);

        context.registerShutdownHook();

        System.out.println("++++++++++++++++++++++++++++++");
        InterfaceBeanLifeCycle obj1 = (InterfaceBeanLifeCycle) context.getBean("Interface1");
        System.out.println(obj1);

        System.out.println("++++++++++++++++++++++++++++++++");
        AnnotationBeanLifeCycle obj2 = (AnnotationBeanLifeCycle)context.getBean("Annotation1");
        System.out.println(obj2);
    }

}
