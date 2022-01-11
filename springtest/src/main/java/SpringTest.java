
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(beanDefinitionCount);
    }
}
