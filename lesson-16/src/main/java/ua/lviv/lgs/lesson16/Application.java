package ua.lviv.lgs.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		Student student = (Student) ctx.getBean("student");
		
		DaoLayer daolayer = (DaoLayer) ctx.getBean("StudentDao");
		
		daolayer.add(student);
		daolayer.add(student);
		daolayer.add(student);
		daolayer.readall();
		daolayer.read(2);
		daolayer.delete(2);
		daolayer.delete(1);
		daolayer.readall();
	}
}
