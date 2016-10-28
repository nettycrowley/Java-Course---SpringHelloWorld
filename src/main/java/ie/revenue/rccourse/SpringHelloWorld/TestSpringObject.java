package ie.revenue.rccourse.SpringHelloWorld ;

import org.springframework.stereotype.Component;

@component
public class TestSpringObject implements Something{
	
	protected String name;
	
	//gettter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestSpringObject(){
		
	}
	
	public TestSpringObject(String name){
		this.name = name;
	}
	
	public void doSomething(){
		System.out.println("Doing something....");
	}

}
