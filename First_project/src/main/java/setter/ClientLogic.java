package setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/ApplicationContext.xml");
        WelcomeBean wb = context.getBean("id1", WelcomeBean.class);
        wb.show();
    }
}

