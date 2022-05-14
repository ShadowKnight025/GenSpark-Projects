package org.assignment.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        student Student = (student) context.getBean("student");
        phone Phn = (phone) context.getBean("phone");
        address Address = ctx.getBean(address.class);


        Address.setCity("los angeles");
        Address.setCountry("USA");
        Address.setState("California");
        Address.setZipcode("808080");

        Phn.setMob("111-111-1111");

        Student.setName("Sally");
        Student.setId(47);
        Student.getPh();
        Student.setAdd(Address);

        System.out.println(Student.toString());

    }
}
