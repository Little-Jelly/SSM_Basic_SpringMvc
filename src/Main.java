import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc-config.xml");
        com.yyf.Controller.FirstController a = ac.getBean("FirstController",com.yyf.Controller.FirstController.class);
        System.out.println(a);
    }
}
