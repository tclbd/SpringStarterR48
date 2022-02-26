
import com.spring.start.Message;
import com.spring.start.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringHelloWorld {
    public static void main(String[] args) {
//        Message m = new Message();
//        m.getMessage();
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        //Message m = (Message) ctx.getBean("message");
//        m.getMessage();
//        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Message.class);
        Message p = ctx.getBean(Message.class);
        p.getMessage();
        ctx.registerShutdownHook();
    }
}
