package Pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
      HelloSpring obj = (HelloSpring) context.getBean("helloWorld");
      obj.getMessage();
      int m=obj.getRoll();
      System.out.println(m);
   }
}