package ie.revenue.rccourse.SpringHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	protected Something something;
	
	//get & set methods
	public Something getSomething() {
		return something;
	}
	
	@Autowired
	public void setSomething(Something something) {
		this.something = something;
	}

	public static void main( String[] args )
    {
     
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
    	
    	TestSpringObject t = context.getBean(TestSpringObject);
    	
    	App app = new App();
    	
    	app.something.dosomething;
    	
    	//something.doSomething();
    }
    	
/*    	//TestSpringObject


		
    	String[] names = context.getBeanNamesForType(Something.class);
    	
    	for (String name : names) {
    		System.out.println(name);
    	}
    	
    	Something s = (Something)context.getBean(names[0]);
    	
    	s.doSomething();
    	
    	
    	TestSpringObject tso = (TestSpringObject) context.getBean("testSpringObject");
		
		tso.doSomething();
		
		System.out.println(tso.getName());
    }*/
}
