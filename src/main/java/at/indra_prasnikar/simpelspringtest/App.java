package at.indra_prasnikar.simpelspringtest;

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
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       OrderService myService = (OrderService) ctx.getBean("orderService");
       System.out.println(myService.createOrder(new Integer ("1")));
    }
}
