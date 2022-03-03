
import com.spring.start.DebuggingClass;
import com.spring.start.Message;
import com.spring.start.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class SpringHelloWorld {
    public static void main(String[] args) {
//        Message m = new Message();
//        m.getMessage();
       // BeanFactory ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        //Message m = (Message) ctx.getBean("message");
//        m.getMessage();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");        
        DebuggingClass dc = ctx.getBean(DebuggingClass.class);
        dc.method1();
        dc.method2();
        dc.method3();
     
    }
}
