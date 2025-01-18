package in.subiditchakraborty.mavenproject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      String configLocation="/in/sp/resources/applicationContext.xml";
      ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
      Student std= context.getBean(Student.class);
      std.display();
    }
}
