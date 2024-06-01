package com.nt.test;
import com.nt.beans.A;
import com.nt.beans.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Create ApplicationContext
        ApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");

        // Retrieve bean from the ApplicationContext
        A a = (A) context.getBean("a1");
        B b= (B) context.getBean("b1");
        // Use the retrieved bean
        System.out.println(a);
        System.out.println(b);
        ((AbstractApplicationContext) context).close();
    }
}
