package example7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "example7" })
public class Application7 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application7.class);

		for (int i = 0; i < 2; i++) {
			System.out.format("************* %d ************\n", i);
			Dog dog = ctx.getBean(Dog.class);
			System.out.println(dog);
			System.out.println(dog.bark1());
			System.out.println(dog.bark2());
			System.out.println(dog.bark3());
		}
		ctx.close();
	}

}
