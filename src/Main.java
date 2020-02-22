import com.yyf.core.Controller.FirstController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/yyf/core/springmvc-config.xml");
        FirstController a = ac.getBean("FirstController", FirstController.class);
        System.out.println(a);
    }
}
