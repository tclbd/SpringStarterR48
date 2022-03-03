
import com.spring.start.Address;
import com.spring.start.Employee;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        ctx.registerShutdownHook();
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Employee.class);
        Employee employee = (Employee) ctx.getBean("e3");
        employee.setAge(20);
        System.out.println(employee.getAge());
       
        Address addr = (Address) ctx.getBean("address");
        System.out.println(addr.toString());
        
        
//        Employee e = new Employee();
//        Employee e1 = new Employee();
//        e.setName("Mr. A");
//        System.out.println(e1.getName());
    }
}
